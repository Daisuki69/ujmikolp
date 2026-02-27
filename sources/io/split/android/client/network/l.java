package io.split.android.client.network;

import androidx.media3.exoplayer.rtsp.RtspHeaders;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashMap f17603b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f17604a = new HashMap();

    static {
        HashMap map = new HashMap();
        f17603b = map;
        map.put(RtspHeaders.CACHE_CONTROL, "no-cache");
    }

    public final HashMap a() {
        HashMap map = this.f17604a;
        if (map.get(RtspHeaders.CONTENT_TYPE) == null) {
            throw new IllegalArgumentException("Missing CONTENT TYPE header!");
        }
        if (((String) map.get(RtspHeaders.CONTENT_TYPE)).equals("application/json")) {
            if (map.get(RtspHeaders.AUTHORIZATION) == null) {
                throw new IllegalArgumentException("Missing authorization header!");
            }
            if (map.get("SplitSDKVersion") == null) {
                throw new IllegalArgumentException("Missing client version header!");
            }
        } else {
            if (!((String) map.get(RtspHeaders.CONTENT_TYPE)).equals("text/event-stream")) {
                throw new IllegalArgumentException("Invalid CONTENT TYPE header!");
            }
            if (map.get("SplitSDKClientKey") == null) {
                throw new IllegalArgumentException("Missing ably key header!");
            }
        }
        return map;
    }

    public final void b(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Client Version Http Header cannot be null!");
        }
        this.f17604a.put("SplitSDKVersion", str);
    }
}
