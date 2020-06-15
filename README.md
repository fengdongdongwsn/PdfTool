本项目是个小工具，使用了第三方库

目的：
目前存在的一些pdf转word的工具，或者是限制页数，或者是限制文件大小。
而且一些实现的代码很容易造成失真。

本工具特点：
1、不失真，完全保留原状
2、没有文件页数和大小限制
3、完全免费

目前只是做了一个最简单的实现，jar我也没打

流程：
1、git clone git@github.com:fengdongdongwsn/PdfTool.git
2、导入Eclipse（我没有使用Maven，因为最近我的Idea环境有一些问题，所以直接使用的jar包）
3、Main类中调用new PdfToWord().pdftoword(srcPath+“fdd.pdf");即可

有兄弟如果打包了jar，可以私信我fdd15735171890