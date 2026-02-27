package com.tencent.could.component.common.ai.utils;

import android.os.Looper;
import android.util.Log;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class ThreadPoolUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ThreadPoolExecutor f15605a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ThreadPoolUtil f15606a = new ThreadPoolUtil();
    }

    public ThreadPoolUtil() {
        a();
    }

    public static ThreadPoolUtil getInstance() {
        return a.f15606a;
    }

    public final void a() {
        this.f15605a = new ThreadPoolExecutor(8, 64, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadPoolExecutor.CallerRunsPolicy());
    }

    public void addWork(Runnable runnable) {
        if (this.f15605a.isShutdown()) {
            Log.e("ThreadPoolUtil", "Thread Pool is ready shutdown!");
        } else {
            this.f15605a.execute(runnable);
        }
    }

    public void showDown() {
        if (this.f15605a.isShutdown()) {
            return;
        }
        this.f15605a.shutdown();
    }

    public void waitThreadTime() {
        if (Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId()) {
            Log.e("ThreadPoolUtil", "Want wait thread in main thread!");
            return;
        }
        try {
            Thread.sleep(500L);
        } catch (InterruptedException unused) {
            Log.e("ThreadPoolUtil", "InterruptedException in sleep thread!");
        }
    }
}
