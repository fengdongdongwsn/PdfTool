本项目是个小工具，使用了第三方库Spire的免费版本

## 目的

最近我有一个需求，就是把一个很大的PDF转换为word，要求是尽量不失真。但是我找了很多的在线免费转换工具，或者是有页数要求，或者是有大小要求。高级功能需要收费。

于是我考虑自己去实现，第一想到的是python，这个实现起来很简单，但是转换后的word会失真，页面的排版等等不符合要求，于是考虑采用第三方免费工具，然后写代码自己转换。

目前的话我没有做成web形式的，后期会改进。

## 转换思路如下：

1、免费版本转换页数要求11页

2、输入一个pdf时候，小于11页直接转换，大于11页就先切分成子pdf

3、对每一个小的pdf进行转换，最后再合并。

总体上就是一个大的pdf拆分转换再合并的问题。

#### 其他的思路：

不使用第三方库，直接OCR技术扫描。这个技术我正在考虑当中，有兴趣的可以添加我的微信交流：

![](G:\博客\微信号最新.jpg)

## 本工具特点：

1、图片不会转换

2、文字正常转换

3、数学公式正常转换

4、排版不会失真

（完全的不失真也做不到，会有微小的差别，但是和pdf基本上一样）

## 使用流程

1、git clone git@github.com:fengdongdongwsn/PdfTool.git

2、如果你是Eclipse或者是MyEclipse，直接导入运行即可，入口类在Main.java

3、如果你是Idea或其他的Maven环境下，在pom.xml环境中添加如下依赖：

```xml
    <repositories>
        <repository>
            <id>com.e-iceblue</id>
            <url>http://repo.e-iceblue.cn/repository/maven-public/</url>
        </repository>
    </repositories>

    <dependencies>
        <dependency>
            <groupId>e-iceblue</groupId>
            <artifactId>spire.pdf.free</artifactId>
            <version>2.6.3</version>
        </dependency>

        <dependency>
            <groupId>e-iceblue</groupId>
            <artifactId>spire.doc.free</artifactId>
            <version>2.7.3</version>
        </dependency>

    </dependencies>
```

然后直接运行Main类

## 个人说明

喜欢的给个支持吧各位老铁们：

![](G:\博客\公众号.jpg)