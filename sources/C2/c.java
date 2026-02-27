package C2;

import com.google.firebase.installations.FirebaseInstallationsException;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f673b;

    public /* synthetic */ c(d dVar, int i) {
        this.f672a = i;
        this.f673b = dVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        D2.b bVarL;
        D2.b bVarI;
        switch (this.f672a) {
            case 0:
                this.f673b.b();
                return;
            case 1:
                this.f673b.b();
                return;
            default:
                d dVar = this.f673b;
                dVar.getClass();
                synchronized (d.m) {
                    try {
                        U1.g gVar = dVar.f674a;
                        gVar.a();
                        A7.f fVarC = A7.f.c(gVar.f5904a);
                        try {
                            bVarL = dVar.c.l();
                            if (fVarC != null) {
                                fVarC.m();
                            }
                        } catch (Throwable th2) {
                            if (fVarC != null) {
                                fVarC.m();
                            }
                            throw th2;
                        }
                    } finally {
                    }
                }
                try {
                    int i = bVarL.f971b;
                    if (i == 5) {
                        bVarI = dVar.i(bVarL);
                    } else {
                        if (i == 3) {
                            bVarI = dVar.i(bVarL);
                        } else if (!dVar.f676d.a(bVarL)) {
                            return;
                        } else {
                            bVarI = dVar.c(bVarL);
                        }
                    }
                    dVar.f(bVarI);
                    dVar.m(bVarL, bVarI);
                    if (bVarI.f971b == 4) {
                        dVar.l(bVarI.f970a);
                    }
                    int i4 = bVarI.f971b;
                    if (i4 == 5) {
                        dVar.j(new FirebaseInstallationsException());
                        return;
                    } else if (i4 == 2 || i4 == 1) {
                        dVar.j(new IOException("Installation ID could not be validated with the Firebase servers (maybe it was deleted). Firebase Installations will need to create a new Installation ID and auth token. Please retry your last request."));
                        return;
                    } else {
                        dVar.k(bVarI);
                        return;
                    }
                } catch (FirebaseInstallationsException e) {
                    dVar.j(e);
                    return;
                }
        }
    }
}
