package yf;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends FilterInputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f21161b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21162a;

    public h(InputStream inputStream, List list) {
        super(inputStream);
        this.f21162a = list;
    }
}
