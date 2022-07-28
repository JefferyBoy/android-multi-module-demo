# Android模块化实践模型

在一个大的Android项目中，项目代码量大，开发人员多。在多人开发中很容易出现错误，比如资源文件重名、编译时某个重名的文件会被覆盖。由于项目大，测试起来也不方面。

本项目是一个模块化的参考模型，以最简化的方式提供一个可参考使用的模块化方案。分为两个分支。

1. master主分支。模块化简单模型
2. arouter分支。集成阿里的Arouter库后的模型

## 1. 实现的功能

1. 多个模块可独立运行、测试
2. 多个模块可合并成一个整体APP进行运行、测试
3. 模块独立运行时和集成运行时，可分别使用不同的Manifest和源代码。如，独立运行时使用的代码在集成运行时可不参与编译
4. 统一配置各模块的第三方库依赖版本、编译参数
5. 各模块的资源文件添加自己的模块名称前缀，避免出现模块之间资源文件被覆盖问题
6. 统一各模块中的系统主题、颜色等

修改env.gradle中isRelease的值，设置是否为正式版

1. isRelease = true时，集成每个模块为一个APP（只有一个APP）

项目中只有一个APP,其他显示为不可用，无法运行
![](https://fastly.jsdelivr.net/gh/JefferyBoy/pictures@master/2022/16590018491211659001848885.png)

2. isRelease = false时，拆分为6个APP,每个APP可独立运行

项目包含6个APP,每个APP可独立运行
![](https://fastly.jsdelivr.net/gh/JefferyBoy/pictures@master/2022/16590018991191659001898871.png)

项目代码以哔哩哔哩手机APP为参考项目，拆分为多个模块

![模块关系](https://fastly.jsdelivr.net/gh/JefferyBoy/pictures@master/2022/16590010191201659001018551.png)
