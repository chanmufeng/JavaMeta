package designPatternAndPrinciple.principle.openClose;

/**
 * @author 蝉沐风
 * @description 猫粮类
 * @date 2022/2/8
 */
public abstract class CatFood {
    //猫粮口味
    private String flavor;

    //订购数量
    private Integer count;

    public abstract void order();

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public CatFood(String flavor, Integer count) {
        this.flavor = flavor;
        this.count = count;
    }

    public CatFood() {
    }
}
