import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.monitor.SpiderMonitor;
import us.codecraft.webmagic.pipeline.ConsolePipeline;
import us.codecraft.webmagic.pipeline.JsonFilePipeline;
import us.codecraft.webmagic.processor.PageProcessor;
import view.SeleniumTest;

import javax.management.JMException;
import javax.swing.*;
import java.awt.*;

/**
 * Created by Evilina on 2016/4/18.
 */
public class Main{

    public static void main(String[] args) {
//        EventQueue.invokeLater(new Runnable() {
//            @Override
//            public void run() {
//                JFrame frame = new JFrame();
//                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//                frame.setVisible(true);
//            }
//        });
/*

        Spider.create(new SpiderProcess())
                //从"https://github.com/code4craft"开始抓
//                .addUrl("http://openlaw.cn/judgement/cb8a8e70d5b64b44a9e8b0cc9cd37f38")
                .addUrl("http://openlaw.cn/court/122cdba439084de584e898cd0cbbb04f")
//                .addUrl("http://openlaw.cn/judgement/")
//                .addPipeline(new JsonFilePipeline("D:\\webmagic\\"))
                .addPipeline(new ConsolePipeline())
                //开启5个线程抓取
                .thread(2)
                //启动爬虫
                .run();
*/
        new SeleniumTest().startFirefox();

//        Spider testSpider = Spider.create(new SpiderProcess())
//                .addUrl("http://www.baidu.com")
//                .addPipeline(new JsonFilePipeline("D:\\webmagic\\"));
//        SpiderMonitor.instance().register(testSpider);
//        testSpider.run();

    }
}
