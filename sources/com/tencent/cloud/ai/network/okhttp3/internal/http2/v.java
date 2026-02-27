package com.tencent.cloud.ai.network.okhttp3.internal.http2;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class v extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f15523a;

    /* JADX WARN: Illegal instructions before constructor call */
    public v(int i) {
        String str;
        switch (i) {
            case 1:
                str = "NO_ERROR";
                break;
            case 2:
                str = "PROTOCOL_ERROR";
                break;
            case 3:
                str = "INTERNAL_ERROR";
                break;
            case 4:
                str = "FLOW_CONTROL_ERROR";
                break;
            case 5:
                str = "REFUSED_STREAM";
                break;
            case 6:
                str = "CANCEL";
                break;
            case 7:
                str = "COMPRESSION_ERROR";
                break;
            case 8:
                str = "CONNECT_ERROR";
                break;
            case 9:
                str = "ENHANCE_YOUR_CALM";
                break;
            case 10:
                str = "INADEQUATE_SECURITY";
                break;
            case 11:
                str = "HTTP_1_1_REQUIRED";
                break;
            default:
                str = "null";
                break;
        }
        super("stream was reset: ".concat(str));
        this.f15523a = i;
    }
}
