import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.processor.PageProcessor;

/**
 * Created by Evilina on 2016/4/19.
 */
public class SpiderProcess implements PageProcessor {
    // 部分一：抓取网站的相关配置，包括编码、抓取间隔、重试次数等
    private Site site = Site.me()
            .setRetryTimes(1)
            .addHeader("Referer","http://openlaw.cn")
            .setCharset("utf-8")
            .setSleepTime(8000)
            .setUserAgent("Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/46.0.2490.86 Safari/537.36 LBBROWSER");


    @Override
    // process是定制爬虫逻辑的核心接口，在这里编写抽取逻辑
    public void process(Page page) {
        // 部分二：定义如何抽取页面信息，并保存下来
        page.putField("name", page.getUrl().regex("http://openlaw.cn/judgement/\\w+").toString());

        page.putField("content", page.getHtml().xpath("//*[@id=\"entry-cont\"]/div").toString());
        page.putField("content", page.getHtml().toString());
//        if (page.getResultItems().get("name") == null) {
//            //skip this page
//            page.setSkip(true);
//        }
//        page.putField("readme", page.getHtml().xpath("//div[@id='readme']/tidyText()"));
        page.addTargetRequests(page.getHtml().links().regex("(http://openlaw.cn/judgement/\\w+)").all());
    }

    @Override
    public Site getSite() {
        return site;
    }
}
