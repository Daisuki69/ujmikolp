package nj;

import cj.AbstractC1116b;
import java.io.File;
import java.util.ArrayDeque;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends AbstractC1116b {
    public final ArrayDeque c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h f18741d;

    public f(h hVar) {
        this.f18741d = hVar;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.c = arrayDeque;
        if (hVar.f18743a.isDirectory()) {
            arrayDeque.push(b(hVar.f18743a));
        } else {
            if (!hVar.f18743a.isFile()) {
                this.f9384a = 2;
                return;
            }
            File rootFile = hVar.f18743a;
            kotlin.jvm.internal.j.g(rootFile, "rootFile");
            arrayDeque.push(new d(rootFile));
        }
    }

    @Override // cj.AbstractC1116b
    public final void a() {
        File file;
        File fileA;
        while (true) {
            ArrayDeque arrayDeque = this.c;
            g gVar = (g) arrayDeque.peek();
            if (gVar == null) {
                file = null;
                break;
            }
            fileA = gVar.a();
            if (fileA == null) {
                arrayDeque.pop();
            } else if (fileA.equals(gVar.f18742a) || !fileA.isDirectory() || arrayDeque.size() >= this.f18741d.f) {
                break;
            } else {
                arrayDeque.push(b(fileA));
            }
        }
        file = fileA;
        if (file == null) {
            this.f9384a = 2;
        } else {
            this.f9385b = file;
            this.f9384a = 1;
        }
    }

    public final b b(File file) {
        int iOrdinal = this.f18741d.f18744b.ordinal();
        if (iOrdinal == 0) {
            return new e(this, file);
        }
        if (iOrdinal == 1) {
            return new c(this, file);
        }
        throw new NoWhenBranchMatchedException();
    }
}
