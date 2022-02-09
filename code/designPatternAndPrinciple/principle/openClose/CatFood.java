package designPatternAndPrinciple.principle.openClose;

/**
 * @author 蝉沐风
 * @description 猫粮类
 * @date 2022/2/8
 */
public abstract class CatFood {

    //订购数量
    private Integer count;

    public abstract void order();

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public CatFood(Integer count) {
        this.count = count;
    }

    public CatFood() {
    }
}
