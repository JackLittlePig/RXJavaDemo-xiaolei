
使用介绍说明如下：
1.基本方式1:
1》使用Observable的create()创建被观察者，重写call(),在该方法中调用观察者的onNext(),onCompleted(),onError()方法
2》new Subscriber(){}创建观察者，重写onNext()(输出信息),onCompleted(),onError()
3》被观察者Observerable对象调用subscribe(Subscriber对象);完成subscriber对observable的订阅

案例:请看项目中方法baseUseRxjava1()
基本方式2: 1》使用Observable的just()创建被观察者返回被观察者对象；
2》被观察者对象调用subscribe(new Action(){publid void call(T t){}})

       备注：使用lambda范式为：
          Observable.just("哈哈哈")
                    .subscribe(s ->
               Log.e("=====", "====callfff输出内容为==" + s));
案例:请看项目中方法baseUseRxjava2()
基本方式3:
1》使用Observable的from(T[] array)创建被观察者;(接收一个集合作为输入，然后每次输出一个元素给subscriber)
2》被观察者对象调用subscribe(new Action(){publid void call(T t){}})

 案例:请看项目中方法baseUseRxjava3()
###2. RxJava的常用操作符的介绍：
1》map()：把一个事件转换为另一个事件(用于变换Observable对象的，实现链式调用，最终将最简洁的数据传递给Subscriber对象)
示例：

     //刚创建的Observable是String类型的
      Observable.just("Hellp Map Operator")
              .map(new Func1<String, Integer>() {
                  @Override
                  public Integer call(String s) {
                      Log.e("=====", "=第一个map转化==");
                      return 2016;
                  }
              }).map(new Func1<Integer, String>() {
          @Override
          public String call(Integer integer) {
              Log.e("=====", "=第二个map转化=");
              return String.valueOf(integer);
          }
      }).subscribe(new Action1<String>() {
          @Override
          public void call(String s) {
              Log.e("=====", "=最终结果="+s);

          }
      });
使用范式形式：

           //范式形式如下：
           Observable.just("Hellp Map Operator")
                   //第一次转化
                   .map(s -> "2016")
                   //第二次转化
                   .map(m -> 2016)
                   //最终结果发给观察者
                   .subscribe(k -> Log.e("=====", "=最终结果=" + k));
       }


