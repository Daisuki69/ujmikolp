package com.tencent.could.huiyansdk.utils;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.widget.TextView;
import com.tencent.could.huiyansdk.manager.e;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes4.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public HandlerThread f15737a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Handler f15738b;
    public TextView c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f15739d = "";
    public Queue<String> e;

    public g() {
        LinkedList linkedList = new LinkedList();
        this.e = linkedList;
        linkedList.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(String str) {
        this.c.setText(str);
    }

    public void a(String str) {
        if (this.f15739d.equals(str)) {
            return;
        }
        this.f15739d = str;
        this.c.setText(str);
    }

    public final void b() {
        if (this.f15738b == null) {
            return;
        }
        try {
            Message messageObtainMessage = this.f15738b.obtainMessage();
            messageObtainMessage.what = 1;
            this.f15738b.sendMessageDelayed(messageObtainMessage, 1000L);
        } catch (Exception e) {
            e.a.f15688a.a(2, "ShowTipsHelper", "failed to send wait extra tips event" + e.getLocalizedMessage());
        }
    }

    public final void a() {
        if (this.c != null && this.e.size() > 0) {
            this.c.post(new io.flutter.plugins.firebase.core.a(this, this.e.poll(), 13));
        }
    }
}
