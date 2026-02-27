package com.tencent.could.huiyansdk.fragments;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.tencent.could.huiyansdk.api.j;
import com.tencent.could.huiyansdk.base.HuiYanBaseApi;
import com.tencent.could.huiyansdk.manager.e;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class BaseFragment extends Fragment {
    public static final String TAG = "BaseFragment";
    public View fragmentView;

    public void backPopEvent() {
    }

    public void exit() {
        if (getActivity() == null) {
            return;
        }
        FragmentActivity activity = getActivity();
        Objects.requireNonNull(activity);
        if (activity.isFinishing()) {
            return;
        }
        FragmentActivity activity2 = getActivity();
        Objects.requireNonNull(activity2);
        activity2.finish();
    }

    public Resources getContextResources() {
        if (!isAdded()) {
            Context contextA = j.a.f15618a.a();
            if (contextA != null) {
                return contextA.getResources();
            }
            Context contextA2 = HuiYanBaseApi.a.f15622a.a();
            if (contextA2 != null) {
                return contextA2.getResources();
            }
        }
        return getResources();
    }

    public String getResString(int i) {
        return getContextResources().getString(i);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View view = this.fragmentView;
        if (view == null) {
            return super.onCreateView(layoutInflater, viewGroup, bundle);
        }
        com.tencent.could.huiyansdk.api.g gVar = j.a.f15618a.f15614a;
        if (gVar != null) {
            gVar.onMainViewCreate(view);
        }
        return this.fragmentView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        com.tencent.could.huiyansdk.api.g gVar = j.a.f15618a.f15614a;
        if (gVar != null) {
            gVar.onMainViewDestroy();
        }
        if (this.fragmentView != null) {
            this.fragmentView = null;
        }
        super.onDestroy();
    }

    public void runOnUiThread(Runnable runnable) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.runOnUiThread(runnable);
        } else {
            e.a.f15688a.a(2, TAG, "fragment attach activity is null");
        }
    }
}
