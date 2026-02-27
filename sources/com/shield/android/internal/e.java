package com.shield.android.internal;

import We.s;
import com.google.gson.o;
import com.google.gson.p;
import com.google.gson.q;
import com.paymaya.common.utility.AbstractC1213b;
import java.lang.Character;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static long[] f15413d = {33823392, 85533283, 288048094, 152308524};
    public boolean fW;
    public boolean fX;
    public boolean fY;
    public long fZ;

    /* JADX INFO: renamed from: ga, reason: collision with root package name */
    public boolean f15414ga;

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        long[] jArr = f15413d;
        long j = jArr[0];
        this.fW = ((int) j) ^ 33823392;
        this.fX = ((int) j) ^ 33823392;
        this.fY = ((int) jArr[1]) ^ 85533282;
        this.fZ = jArr[2] ^ 289110182;
        this.f15414ga = ((int) j) ^ 33823392;
    }

    public static q a(JSONObject jSONObject, boolean z4) {
        o oVarH;
        JSONObject jSONObject2 = new JSONObject();
        try {
            a(jSONObject, jSONObject2, g(""), z4);
        } catch (Exception unused) {
        }
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject2.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                map.put(next, jSONObject2.get(next));
            } catch (Exception unused2) {
            }
        }
        TreeMap treeMap = new TreeMap(map);
        q qVar = new q();
        for (Map.Entry entry : treeMap.entrySet()) {
            try {
                String str = (String) entry.getKey();
                com.google.gson.j jVar = new com.google.gson.j();
                Object value = entry.getValue();
                if (value == null) {
                    oVarH = p.f10033a;
                } else {
                    Class<?> cls = value.getClass();
                    com.google.gson.internal.bind.f fVar = new com.google.gson.internal.bind.f();
                    jVar.n(value, cls, fVar);
                    oVarH = fVar.H();
                }
                qVar.k(str, oVarH);
            } catch (Exception unused3) {
            }
        }
        return qVar;
    }

    public static String g(String str) {
        StringBuilder sb2 = new StringBuilder();
        int i = ((int) f15413d[0]) ^ 33823392;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            long[] jArr = f15413d;
            long j = jArr[3];
            long j6 = jArr[1];
            int i4 = ~cCharAt;
            int i6 = (((int) j) ^ 152366933) + cCharAt;
            sb2.append((char) AbstractC1213b.G(cCharAt + (((int) j) ^ 152366933) + (((int) j6) ^ 85533282), i4 | (~(((int) j) ^ 152366933)), i6, (((int) j) ^ 152366933) + cCharAt + (((int) j6) ^ 85533282) + ((~(((int) j) ^ 152366933)) | i4)));
            long j7 = f15413d[1];
            int i10 = ~i;
            i = i + (((int) j7) ^ 85533282) + (((int) j7) ^ 85533282) + ((~(((int) j7) ^ 85533282)) | i10) + (((((int) j7) ^ 85533282) + i) - ((((((int) j7) ^ 85533282) + i) + (((int) j7) ^ 85533282)) + ((~(((int) j7) ^ 85533282)) | i10)));
        }
        return sb2.toString();
    }

    private static String l(String str) {
        StringBuilder sb2 = new StringBuilder();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i = ((int) f15413d[0]) ^ 33823392;
        while (i < length) {
            char c = charArray[i];
            if (Character.isLetterOrDigit(c) && Character.UnicodeBlock.of(c) == Character.UnicodeBlock.BASIC_LATIN) {
                sb2.append(c);
            }
            long j = f15413d[1];
            int i4 = ~i;
            i = i + (((int) j) ^ 85533282) + (((int) j) ^ 85533282) + ((~(((int) j) ^ 85533282)) | i4) + (((((int) j) ^ 85533282) + i) - ((((((int) j) ^ 85533282) + i) + (((int) j) ^ 85533282)) + ((~(((int) j) ^ 85533282)) | i4)));
        }
        return sb2.toString();
    }

    private static void a(JSONObject jSONObject, JSONObject jSONObject2, String str, boolean z4) throws JSONException {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objL = jSONObject.get(next);
            if (objL instanceof JSONObject) {
                StringBuilder sbV = s.v(str, next);
                sbV.append(g("\ue457"));
                a((JSONObject) objL, jSONObject2, sbV.toString(), z4);
            } else if (objL instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) objL;
                int i = ((int) f15413d[0]) ^ 33823392;
                while (i < jSONArray.length()) {
                    if (jSONArray.get(i) instanceof JSONObject) {
                        a((JSONObject) jSONArray.get(i), jSONObject2, str + next + i + g("\ue457"), z4);
                    } else {
                        Object objL2 = jSONArray.get(i);
                        if (z4) {
                            try {
                                if (((JSONArray) objL).get(i) instanceof String) {
                                    objL2 = l(objL.toString());
                                }
                            } catch (Throwable unused) {
                            }
                        }
                        jSONObject2.put(str + next + i, objL2);
                    }
                    long j = f15413d[1];
                    int i4 = ~i;
                    i = i + (((int) j) ^ 85533282) + (((int) j) ^ 85533282) + ((~(((int) j) ^ 85533282)) | i4) + (((((int) j) ^ 85533282) + i) - ((((((int) j) ^ 85533282) + i) + (((int) j) ^ 85533282)) + ((~(((int) j) ^ 85533282)) | i4)));
                }
            } else {
                if (z4) {
                    try {
                        if (objL instanceof String) {
                            objL = l(objL.toString());
                        }
                    } catch (Throwable unused2) {
                    }
                }
                jSONObject2.put(str + next, objL);
            }
        }
    }
}
