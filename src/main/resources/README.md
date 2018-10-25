QS

    Q. xml无法识别yml里配置参数${}，导致无法连接jdbc
       因为url写的localhost? 应使用127.0.0.1. 当时url显示是红字，需要在MavenProject里点击"reimport",像刷新图标的那个
    A: 1.感觉是单独运行mybatis-generator配置时，并不能加载properties/yml文件 .
       2.有些参数无法读取，是因为没有reimport，但是集成mybatis时，无法获取yml里面的数据库配置Cannot resolve property key
        
      
 
