package e0;

import U8.c;
import cj.C1110A;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import zj.C2581c;

/* JADX INFO: renamed from: e0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1416a implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f16545b;
    public final W4.b c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BufferedReader f16546d;

    public C1416a(c cVar, int i, Map map, InputStream inputStream, W4.b bVar) {
        this.f16544a = i;
        this.f16545b = map;
        this.c = bVar;
        this.f16546d = inputStream != null ? new BufferedReader(new InputStreamReader(inputStream, C2581c.f21468b), 8192) : null;
    }

    public final String b(String str) {
        List list = (List) this.f16545b.get(str);
        if (list != null) {
            return (String) C1110A.H(list);
        }
        return null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        BufferedReader bufferedReader = this.f16546d;
        if (bufferedReader != null) {
            bufferedReader.close();
        }
        this.c.invoke();
    }
}
