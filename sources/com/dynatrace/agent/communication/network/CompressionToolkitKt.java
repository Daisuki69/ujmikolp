package com.dynatrace.agent.communication.network;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.zip.GZIPOutputStream;
import kotlin.Unit;
import kotlin.jvm.internal.j;
import zj.C2581c;

/* JADX INFO: loaded from: classes2.dex */
public final class CompressionToolkitKt {
    public static final byte[] gzipDeflate(String str) throws IOException {
        j.g(str, "<this>");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new GZIPOutputStream(byteArrayOutputStream), C2581c.f21468b), 8192);
        try {
            bufferedWriter.write(str);
            Unit unit = Unit.f18162a;
            bufferedWriter.close();
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            j.f(byteArray, "toByteArray(...)");
            return byteArray;
        } finally {
        }
    }
}
