package com.google.android.gms.internal.ads;

import com.dynatrace.android.agent.Global;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public class zzhpi implements Iterator, Closeable, zzaqt, AutoCloseable {
    private static final zzaqs zza = new zzhph("eof ");
    protected zzaqp zzb;
    protected zzhpj zzc;
    zzaqs zzd = null;
    long zze = 0;
    long zzf = 0;
    private final List zzg = new ArrayList();

    static {
        zzhpp.zzb(zzhpi.class);
    }

    public void close() throws IOException {
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zzaqs zzaqsVar = this.zzd;
        if (zzaqsVar == zza) {
            return false;
        }
        if (zzaqsVar != null) {
            return true;
        }
        try {
            this.zzd = next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zzd = zza;
            return false;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[");
        int i = 0;
        while (true) {
            List list = this.zzg;
            if (i >= list.size()) {
                sb2.append("]");
                return sb2.toString();
            }
            if (i > 0) {
                sb2.append(Global.SEMICOLON);
            }
            sb2.append(((zzaqs) list.get(i)).toString());
            i++;
        }
    }

    public final List zzc() {
        return (this.zzc == null || this.zzd == zza) ? this.zzg : new zzhpo(this.zzg, this);
    }

    public final void zzd(zzhpj zzhpjVar, long j, zzaqp zzaqpVar) throws IOException {
        this.zzc = zzhpjVar;
        this.zze = zzhpjVar.zzc();
        zzhpjVar.zzd(zzhpjVar.zzc() + j);
        this.zzf = zzhpjVar.zzc();
        this.zzb = zzaqpVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final zzaqs next() {
        zzaqs zzaqsVarZzb;
        zzaqs zzaqsVar = this.zzd;
        if (zzaqsVar != null && zzaqsVar != zza) {
            this.zzd = null;
            return zzaqsVar;
        }
        zzhpj zzhpjVar = this.zzc;
        if (zzhpjVar == null || this.zze >= this.zzf) {
            this.zzd = zza;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzhpjVar) {
                this.zzc.zzd(this.zze);
                zzaqsVarZzb = this.zzb.zzb(this.zzc, this);
                this.zze = this.zzc.zzc();
            }
            return zzaqsVarZzb;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }
}
