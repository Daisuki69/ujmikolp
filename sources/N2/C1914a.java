package n2;

import A7.l;
import D.S;
import We.s;
import android.util.Log;
import b1.t;
import com.dynatrace.android.agent.Global;
import h2.g;
import h2.i;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import k2.L0;

/* JADX INFO: renamed from: n2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1914a {
    public static final Charset e = Charset.forName("UTF-8");
    public static final int f = 15;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final l2.a f18582g = new l2.a();
    public static final l h = new l(12);
    public static final g i = new g(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f18583a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1915b f18584b;
    public final t c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f18585d;

    public C1914a(C1915b c1915b, t tVar, i iVar) {
        this.f18584b = c1915b;
        this.c = tVar;
        this.f18585d = iVar;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int i4 = fileInputStream.read(bArr);
                if (i4 <= 0) {
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
                    fileInputStream.close();
                    return str;
                }
                byteArrayOutputStream.write(bArr, 0, i4);
            } catch (Throwable th2) {
                try {
                    fileInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    public static void f(File file, String str) throws IOException {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
        } catch (Throwable th2) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        C1915b c1915b = this.f18584b;
        arrayList.addAll(C1915b.s(((File) c1915b.f18589g).listFiles()));
        arrayList.addAll(C1915b.s(((File) c1915b.h).listFiles()));
        l lVar = h;
        Collections.sort(arrayList, lVar);
        List listS = C1915b.s(((File) c1915b.f).listFiles());
        Collections.sort(listS, lVar);
        arrayList.addAll(listS);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(C1915b.s(((File) this.f18584b.e).list())).descendingSet();
    }

    public final void d(L0 l02, String str, boolean z4) {
        C1915b c1915b = this.f18584b;
        S s9 = this.c.h().f19017a;
        f18582g.getClass();
        try {
            f(c1915b.m(str, s.j("event", String.format(Locale.US, "%010d", Integer.valueOf(this.f18583a.getAndIncrement())), z4 ? Global.UNDERSCORE : "")), l2.a.f18226a.a(l02));
        } catch (IOException e7) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e7);
        }
        g gVar = new g(3);
        c1915b.getClass();
        File file = new File((File) c1915b.e, str);
        file.mkdirs();
        List<File> listS = C1915b.s(file.listFiles(gVar));
        Collections.sort(listS, new l(13));
        int size = listS.size();
        for (File file2 : listS) {
            if (size <= s9.f865a) {
                return;
            }
            C1915b.r(file2);
            size--;
        }
    }
}
