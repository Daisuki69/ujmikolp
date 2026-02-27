package com.tencent.could.component.common.ai.net;

import com.tencent.could.component.common.ai.eventreport.entry.NetWorkParam;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class ThreadManager {
    public static ThreadManager f = new ThreadManager();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ThreadPoolExecutor f15588b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public HttpTask f15589d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public LinkedBlockingQueue<Runnable> f15587a = new LinkedBlockingQueue<>();
    public DelayQueue<HttpTask> c = new DelayQueue<>();
    public Runnable failedRunnable = new Runnable() { // from class: com.tencent.could.component.common.ai.net.ThreadManager.1
        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    HttpTask httpTask = (HttpTask) ThreadManager.this.c.take();
                    ThreadManager.this.f15589d = httpTask;
                    int failedNum = httpTask.getFailedNum();
                    if (ThreadManager.this == null) {
                        throw null;
                    }
                    NetWorkParam requestNetWorkParam = httpTask.getRequestNetWorkParam();
                    if (failedNum < (requestNetWorkParam == null ? 3 : requestNetWorkParam.getRetryTimes())) {
                        httpTask.setFailedNum(httpTask.getFailedNum() + 1);
                        ThreadManager.this.f15588b.execute(httpTask);
                        TxNetWorkHelper.getInstance().logDebug("ThreadManager", "network test time: " + httpTask.getFailedNum());
                    } else {
                        CallBackListener callBackListener = ((JsonHttpRequest) httpTask.getIHttpRequest()).getCallBackListener();
                        if (callBackListener != null) {
                            callBackListener.onFailed(httpTask.getTaskError());
                        }
                    }
                } catch (InterruptedException e) {
                    TxNetWorkHelper.getInstance().logError("ThreadManager", "network error , message: " + e.getMessage());
                }
            }
        }
    };
    public Runnable e = new Runnable() { // from class: com.tencent.could.component.common.ai.net.ThreadManager.2
        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    Runnable runnableTake = ThreadManager.this.f15587a.take();
                    if (runnableTake instanceof HttpTask) {
                        ThreadManager.this.f15589d = (HttpTask) runnableTake;
                    }
                    ThreadManager.this.f15588b.execute(runnableTake);
                } catch (InterruptedException e) {
                    TxNetWorkHelper.getInstance().logError("ThreadManager", "network error , message: " + e.getMessage());
                }
            }
        }
    };

    public ThreadManager() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 10, 15L, TimeUnit.SECONDS, new ArrayBlockingQueue(4), new RejectedExecutionHandler() { // from class: com.tencent.could.component.common.ai.net.ThreadManager.3
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                ThreadManager.this.addTask(runnable);
            }
        });
        this.f15588b = threadPoolExecutor;
        threadPoolExecutor.execute(this.e);
        this.f15588b.execute(this.failedRunnable);
    }

    public static ThreadManager getInstance() {
        return f;
    }

    public void addFailedTask(HttpTask httpTask) {
        if (httpTask == null) {
            return;
        }
        httpTask.setDelayTime(1000L);
        this.c.offer(httpTask);
    }

    public void addTask(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        try {
            this.f15587a.put(runnable);
        } catch (InterruptedException e) {
            TxNetWorkHelper.getInstance().logError("ThreadManager", "add network task error , message: " + e.getMessage());
        }
    }

    public synchronized void stopCurrentRequest() {
        HttpTask httpTask = this.f15589d;
        if (httpTask != null) {
            httpTask.cleanRequest();
        }
    }
}
