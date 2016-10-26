package com.lollo.mvp101;

import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action1;
import rx.functions.Func1;
import rx.schedulers.Schedulers;

/**
 * Created by Jet Wang on 2016/10/25.
 */
public class MainPresenter {

    private IMainView mainView;
    private TaskManager taskData;
    public MainPresenter(IMainView view) {
        this.mainView = view;
        this.taskData = new TaskManager(new TaskDataSourceImpl());
    }


    public void getString() {
        /*String s = taskData.getStringContent();
        mainView.onShowString(s);*/
        Observable.just("")
                .map(new Func1<String, String>() {
                    @Override
                    public String call(String s) {
                        return taskData.getStringContent();
                    }
                }).observeOn(Schedulers.io())
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(new Action1<String>() {
                    @Override
                    public void call(String s) {
                        mainView.onShowString(s);
                    }
                });
    }
}
