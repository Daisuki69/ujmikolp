package io.split.android.client.service.sseclient;

import Xh.i;
import com.google.gson.JsonSyntaxException;
import com.google.gson.j;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import p3.C2011b;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Type f17611a;

    static {
        new TypeToken<Map<String, Object>>() { // from class: io.split.android.client.service.sseclient.SseJwtParser$1
        }.getType();
        f17611a = new TypeToken<Map<String, List<String>>>() { // from class: io.split.android.client.service.sseclient.SseJwtParser$2
        }.getType();
    }

    public static SseJwtToken a(String str) {
        if (str == null) {
            Ri.a.g("Error: JWT is null.");
            throw new InvalidJwtTokenException();
        }
        String[] strArrSplit = str.split("\\.");
        String str2 = strArrSplit.length > 1 ? strArrSplit[1] : null;
        if (str2 == null) {
            Ri.a.g("SSE authentication JWT payload is not valid.");
            throw new InvalidJwtTokenException();
        }
        byte[] bArrD = i.d(str2);
        String str3 = bArrD != null ? new String(bArrD, 0, bArrD.length, C2011b.b()) : null;
        if (str3 == null) {
            Ri.a.g("Could not decode SSE authentication JWT payload.");
            throw new InvalidJwtTokenException();
        }
        try {
            j jVar = io.split.android.client.utils.b.f17635a;
            SseAuthToken sseAuthToken = (SseAuthToken) jVar.e(str3, SseAuthToken.class);
            if (sseAuthToken == null || sseAuthToken.getChannelList() == null) {
                Ri.a.g("SSE JWT data is empty or not valid.");
                throw new InvalidJwtTokenException();
            }
            Map map = (Map) jVar.f(sseAuthToken.getChannelList(), f17611a);
            if (map == null) {
                Ri.a.g("SSE JWT has not channels.");
                throw new InvalidJwtTokenException();
            }
            ArrayList arrayList = new ArrayList();
            for (String str4 : map.keySet()) {
                List list = (List) map.get(str4);
                if (list == null || !list.contains("channel-metadata:publishers")) {
                    arrayList.add(str4);
                } else {
                    arrayList.add("[?occupancy=metrics.publishers]" + str4);
                }
            }
            return new SseJwtToken(sseAuthToken.getIssuedAt(), sseAuthToken.getExpirationAt(), arrayList, str);
        } catch (JsonSyntaxException e) {
            Ri.a.g("Error parsing SSE authentication JWT json " + e.getLocalizedMessage());
            throw new InvalidJwtTokenException();
        } catch (Exception e7) {
            Ri.a.g("Unknown error while parsing SSE authentication JWT: " + e7.getLocalizedMessage());
            throw new InvalidJwtTokenException();
        }
    }
}
