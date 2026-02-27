package com.shield.android.internal;

import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h implements Callable<Void> {

    /* JADX INFO: renamed from: bf, reason: collision with root package name */
    public String f15426bf;
    public boolean fH;
    public boolean fL;
    public String fO;
    public boolean fP;
    public String gl;
    public String gm;
    public boolean gn;
    public boolean go;
    public String gp;
    public Set<String> gq;
    public String gr;
    public String gs;
    public Set<String> gt;
    public Set<String> gu;

    public final void a(@NonNull d dVar, @NonNull c cVar) {
        this.gl = dVar.bG();
        this.f15426bf = dVar.bH();
        this.gn = cVar.br();
        this.go = cVar.bs();
        this.fH = cVar.bt();
        this.gp = String.valueOf(cVar.getVersion());
        this.fL = cVar.bx();
        this.gq = new HashSet(cVar.bw());
        this.gr = String.valueOf(cVar.bz());
        this.gs = String.valueOf(cVar.by());
        this.fO = cVar.bA();
        this.fP = cVar.bB();
        this.gt = new HashSet(cVar.bC());
        this.gu = new HashSet(cVar.bD());
    }
}
