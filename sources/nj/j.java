package nj;

import a.AbstractC0617a;
import bg.AbstractC0983W;
import cj.C1127m;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;
import kotlin.Unit;
import zj.C2581c;

/* JADX INFO: loaded from: classes4.dex */
public class j extends i {
    public static byte[] a(File file) throws IOException {
        kotlin.jvm.internal.j.g(file, "<this>");
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArrCopyOf = new byte[i];
            int i4 = i;
            int i6 = 0;
            while (i4 > 0) {
                int i10 = fileInputStream.read(bArrCopyOf, i6, i4);
                if (i10 < 0) {
                    break;
                }
                i4 -= i10;
                i6 += i10;
            }
            if (i4 > 0) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6);
                kotlin.jvm.internal.j.f(bArrCopyOf, "copyOf(...)");
            } else {
                int i11 = fileInputStream.read();
                if (i11 != -1) {
                    C1951a c1951a = new C1951a(8193);
                    c1951a.write(i11);
                    Xh.i.i(fileInputStream, c1951a);
                    int size = c1951a.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] bArrC = c1951a.c();
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, size);
                    kotlin.jvm.internal.j.f(bArrCopyOf, "copyOf(...)");
                    C1127m.d(i, 0, c1951a.size(), bArrC, bArrCopyOf);
                }
            }
            fileInputStream.close();
            return bArrCopyOf;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC0617a.p(fileInputStream, th2);
                throw th3;
            }
        }
    }

    public static String b(File file) throws IOException {
        Charset charset = C2581c.f21468b;
        kotlin.jvm.internal.j.g(charset, "charset");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        try {
            String strX = AbstractC0983W.x(inputStreamReader);
            inputStreamReader.close();
            return strX;
        } finally {
        }
    }

    public static void c(File file, String text) throws IOException {
        Charset charset = C2581c.f21468b;
        kotlin.jvm.internal.j.g(text, "text");
        kotlin.jvm.internal.j.g(charset, "charset");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            d(fileOutputStream, text, charset);
            Unit unit = Unit.f18162a;
            fileOutputStream.close();
        } finally {
        }
    }

    public static final void d(FileOutputStream fileOutputStream, String text, Charset charset) throws IOException {
        kotlin.jvm.internal.j.g(text, "text");
        if (text.length() < 16384) {
            byte[] bytes = text.getBytes(charset);
            kotlin.jvm.internal.j.f(bytes, "getBytes(...)");
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder charsetEncoderOnUnmappableCharacter = charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer charBufferAllocate = CharBuffer.allocate(8192);
        kotlin.jvm.internal.j.d(charsetEncoderOnUnmappableCharacter);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8192 * ((int) Math.ceil(charsetEncoderOnUnmappableCharacter.maxBytesPerChar())));
        kotlin.jvm.internal.j.f(byteBufferAllocate, "allocate(...)");
        int i = 0;
        int i4 = 0;
        while (i < text.length()) {
            int iMin = Math.min(8192 - i4, text.length() - i);
            int i6 = i + iMin;
            char[] cArrArray = charBufferAllocate.array();
            kotlin.jvm.internal.j.f(cArrArray, "array(...)");
            text.getChars(i, i6, cArrArray, i4);
            charBufferAllocate.limit(iMin + i4);
            i4 = 1;
            if (!charsetEncoderOnUnmappableCharacter.encode(charBufferAllocate, byteBufferAllocate, i6 == text.length()).isUnderflow()) {
                throw new IllegalStateException("Check failed.");
            }
            fileOutputStream.write(byteBufferAllocate.array(), 0, byteBufferAllocate.position());
            if (charBufferAllocate.position() != charBufferAllocate.limit()) {
                charBufferAllocate.put(0, charBufferAllocate.get());
            } else {
                i4 = 0;
            }
            charBufferAllocate.clear();
            byteBufferAllocate.clear();
            i = i6;
        }
    }
}
