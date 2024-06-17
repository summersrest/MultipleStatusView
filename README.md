# MultipleStatusView
多状态切换View
原框架增加了AndroidX支持

原框架地址：https://github.com/qyxxjd/MultipleStatusView


### **1、导入**
1.引入jitpack
项目根目录中的settings.gradle

     ```java
    dependencyResolutionManagement {
        repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
        repositories {
            google()
            mavenCentral()
            maven { url = uri("https://www.jitpack.io")}
        }
    }
    ```

  2.添加
Module的build.gradle
    
    ```
    implementation 'com.github.summersrest:MultipleStatusView:v1.0.3'
    ```
