1、功能需求
   1）用户需登录，登录后用户名和头像
   2）音频：播放音频并展示响应信息
           下载、添加、删除和搜索音频
   3）图片：查看图片
           下载、添加、删除图片、给图片添加标签、通过标签搜索图片
   4）视频：播放视频
           下载、添加、删除视频、给视频添加标签、通过标签所有视频

2、数据库   my_resources
   表   1）user       user_id   user_name   user_password
        2）audio      audio_id   audio_name   audio_singer   audio_url
        3）image      image_id   image_name   image_url   image_tags
        4）video      video_id   video_name   video_url   video_tags

3、页面
   1）登录页面
   2）用户主页面
   3）用户详情页面
   4）音频页面
   5）图片页面
   6）视频页面

若前后端不分离，后端用thymeleaf模板引擎渲染（thymeleaf语法自动加应用程序上下文路径）
若前后端分离，后端不使用模板引擎，前端使用vue（主流）