package com.dengyixuan.builder.builder.chainprogramming;/**
 * @Author 85067
 * @create 05/05/2023 15:06
 */

/**
 * @author 85067
 * @version 1.0
 * @description: 手机类 使用建造者实现链式编程，方便复杂对象的创建
 * @date 05/05/2023 15:06
 */
public class Phone {
    @Override
    public String toString() {
        return "Phone{" +
                "cpu='" + cpu + '\'' +
                ", screen='" + screen + '\'' +
                ", memory='" + memory + '\'' +
                ", mainboard='" + mainboard + '\'' +
                '}';
    }

    private String cpu;
    private String screen;
    private String memory;
    private String mainboard;

    /**
     * 私有的构造方法
     * @param builder
     */
    private Phone(Builder builder){
        this.cpu = builder.cpu;
        this.screen = builder.screen;
        this.memory = builder.memory;
        this.mainboard = builder.mainboard;

    }

    /**
     * 静态内部的构建器类，final表示不可以变
     */
    public static final class Builder{
        private String cpu;
        private String screen;
        private String memory;
        private String mainboard;
        public Builder cpu(String cpu){
            this.cpu = cpu;
            return this;
        }

        public Builder screen(String screen){
            this.screen = screen;
            return this;
        }

        public Builder memory(String memory){
            this.memory = memory;
            return this;
        }

        public Builder mainboard(String mainboard){
            this.mainboard = mainboard;
            return this;
        }

        /**
         * 内部类可以访问外部类的私有方法，使用构建者创建phone对象
         * @return
         */
        public Phone build(){
            return new Phone(this);
        }

    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getMainboard() {
        return mainboard;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }
}
