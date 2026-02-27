package com.tencent.could.component.common.ai.net;

import com.tencent.could.component.common.ai.eventreport.entry.NetWorkParam;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class HttpTask implements Runnable, Delayed {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IHttpRequest f15570b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f15571d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f15569a = "";
    public int c = 0;
    public boolean e = false;

    public HttpTask(CallBackListener callBackListener, NetWorkParam netWorkParam) {
        OkHttpRequest okHttpRequest = new OkHttpRequest();
        this.f15570b = okHttpRequest;
        okHttpRequest.setListener(callBackListener);
        this.f15570b.setNetWorkParam(netWorkParam);
        this.f15570b.setNeedUseDeputy(false);
        this.f15570b.setNeedIpBackUrl(false);
    }

    public void cleanRequest() {
        this.e = true;
        IHttpRequest iHttpRequest = this.f15570b;
        if (iHttpRequest != null) {
            iHttpRequest.cleanExecute();
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(Delayed delayed) {
        return 0;
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(getDelayTime() - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
    }

    public long getDelayTime() {
        return this.f15571d;
    }

    public int getFailedNum() {
        return this.c;
    }

    public IHttpRequest getIHttpRequest() {
        return this.f15570b;
    }

    public NetWorkParam getRequestNetWorkParam() {
        return this.f15570b.getNetWorkParam();
    }

    public String getTaskError() {
        return this.f15569a;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f15570b.execute();
        } catch (Exception e) {
            if (this.e) {
                TxNetWorkHelper.getInstance().logDebug("HttpTask", "already stop , do not net retry");
                return;
            }
            this.f15569a = e.getMessage();
            TxNetWorkHelper.getInstance().logDebug("HttpTask", "fail error: " + this.f15569a);
            if (this.c == 1) {
                TxNetWorkHelper.getInstance().logDebug("HttpTask", "next try use deputy!");
                this.f15570b.setNeedUseDeputy(true);
            }
            if (this.c == 2) {
                TxNetWorkHelper.getInstance().logDebug("HttpTask", "next try use back ip!");
                this.f15570b.setNeedIpBackUrl(true);
            }
            if (this.c > 2) {
                TxNetWorkHelper.getInstance().logDebug("HttpTask", "next try use back ip array!");
                this.f15570b.setNeedIpBackUrls(true, this.c - 3);
            }
            ThreadManager.getInstance().addFailedTask(this);
        }
    }

    public void setDelayTime(long j) {
        this.f15571d = System.currentTimeMillis() + j;
    }

    public void setFailedNum(int i) {
        this.c = i;
    }

    public void setTaskError(String str) {
        this.f15569a = str;
    }
}
