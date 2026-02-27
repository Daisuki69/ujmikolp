package com.tencent.could.component.common.ai.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes4.dex */
public class DnsResolver implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15566a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InetAddress f15567b;

    public DnsResolver(String str) {
        this.f15566a = str;
    }

    public synchronized InetAddress getHasAddress() {
        return this.f15567b;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            setAddress(InetAddress.getByName(this.f15566a));
        } catch (UnknownHostException e) {
            TxNetWorkHelper.getInstance().logError("DnsResolver", "UnknownHostException " + this.f15566a + " e: " + e.getLocalizedMessage());
            this.f15567b = null;
        }
    }

    public synchronized void setAddress(InetAddress inetAddress) {
        this.f15567b = inetAddress;
    }
}
