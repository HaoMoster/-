package com.example.lenovo.roomshulvyou.mvp.IModel;

import com.example.lenovo.roomshulvyou.mvp.IView.IIView;

import okhttp3.RequestBody;
import rx.Observable;

/**
 * Created by lenovo on 2018/1/30.
 */

public interface IModelA {
     Observable<RequestBody> getIN(IIView iiView);
}
