package com.google.protobuf;

/* JADX INFO: renamed from: com.google.protobuf.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1201o implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC1203q f10115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC1203q f10116b;

    public AbstractC1201o(AbstractC1203q abstractC1203q) {
        this.f10115a = abstractC1203q;
        if (abstractC1203q.n()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f10116b = (AbstractC1203q) abstractC1203q.k(4);
    }

    public final Object clone() {
        AbstractC1201o abstractC1201o = (AbstractC1201o) this.f10115a.k(5);
        abstractC1201o.f10116b = h();
        return abstractC1201o;
    }

    public final AbstractC1203q g() {
        AbstractC1203q abstractC1203qH = h();
        abstractC1203qH.getClass();
        boolean zIsInitialized = true;
        byte bByteValue = ((Byte) abstractC1203qH.k(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zIsInitialized = false;
            } else {
                T t5 = T.c;
                t5.getClass();
                zIsInitialized = t5.a(abstractC1203qH.getClass()).isInitialized(abstractC1203qH);
                abstractC1203qH.k(2);
            }
        }
        if (zIsInitialized) {
            return abstractC1203qH;
        }
        throw new UninitializedMessageException("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final AbstractC1203q h() {
        if (!this.f10116b.n()) {
            return this.f10116b;
        }
        AbstractC1203q abstractC1203q = this.f10116b;
        abstractC1203q.getClass();
        T t5 = T.c;
        t5.getClass();
        t5.a(abstractC1203q.getClass()).makeImmutable(abstractC1203q);
        abstractC1203q.o();
        return this.f10116b;
    }

    public final void i() {
        if (this.f10116b.n()) {
            return;
        }
        AbstractC1203q abstractC1203q = (AbstractC1203q) this.f10115a.k(4);
        AbstractC1203q abstractC1203q2 = this.f10116b;
        T t5 = T.c;
        t5.getClass();
        t5.a(abstractC1203q.getClass()).mergeFrom(abstractC1203q, abstractC1203q2);
        this.f10116b = abstractC1203q;
    }
}
