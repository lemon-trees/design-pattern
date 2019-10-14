package patterns.creational.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式：通过原对象，克隆出不光是数据结构一样的，并且属性只也是一样的对象，克隆的方法封装在原对象里面；克隆包括浅度克隆和深度克隆
 */
public class Client {

    public static void main(String[] args) {

        Prototype prototype = new Prototype();
        prototype.setName("prototype");
        List<String> attr = new ArrayList<>();
        attr.add("attr1");
        attr.add("attr2");
        prototype.setAttrs(attr);

        Prototype prototypeClone = prototype.clone();

        System.out.println("prototype："+prototype.toString()+" name:"+prototype.getName()+" attr："+prototype.getAttrs().toString());
        System.out.println("prototypeClone："+prototypeClone.toString()+" name:"+prototypeClone.getName()+" attr："+prototypeClone.getAttrs().toString());

    }
}
