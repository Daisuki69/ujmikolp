package com.tencent.youtu.sdkkitframework.liveness;

import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes4.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public YtVideoEncoder f16022a = new YtVideoEncoder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16023b;
    public final int c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f16024d;
    public final int e;
    public String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public JSONArray f16025g;
    public String h;
    public boolean i;
    public boolean j;

    public p(String str, int i, int i4, int i6, String str2) {
        this.f = str2;
        this.f16023b = str;
        this.c = i;
        this.f16024d = i4;
        this.e = i6;
        this.j = YtVideoEncoder.getMediaCodecInfo() == 0;
    }
}
