package adapter.authorize;

import adapter.inherit.Banner;

/**
 * @program: DesignPatternStudy
 * @description:
 * @author: Havad
 * @create: 2023-08-07 15:53
 **/

public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(Banner banner) {
        this.banner = banner;
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
