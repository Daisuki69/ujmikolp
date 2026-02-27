package com.dynatrace.agent.util;

import java.security.SecureRandom;
import kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes2.dex */
public final class HexGenerator {
    public static final HexGenerator INSTANCE = new HexGenerator();

    private HexGenerator() {
    }

    public static final String generateRandomHex(int i) {
        byte[] bArr = new byte[i];
        new SecureRandom().nextBytes(bArr);
        StringBuilder sb2 = new StringBuilder();
        for (int i4 = 0; i4 < i; i4++) {
            String hexString = Integer.toHexString(bArr[i4] & 255);
            if (hexString.length() == 1) {
                sb2.append('0');
            }
            sb2.append(hexString);
        }
        String string = sb2.toString();
        j.f(string, "toString(...)");
        return string;
    }
}
