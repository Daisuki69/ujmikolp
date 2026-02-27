package Ih;

import bg.AbstractC0983W;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import k2.v0;

/* JADX INFO: loaded from: classes4.dex */
public final class o extends AtomicLong implements Fh.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Iterator f2318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile boolean f2319b;
    public boolean c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2320d;
    public final Ah.e e;

    public o(Ah.e eVar, Iterator it, int i) {
        this.f2320d = i;
        this.f2318a = it;
        this.e = eVar;
    }

    @Override // Fh.c
    public final int b(int i) {
        return 1;
    }

    @Override // nk.c
    public final void cancel() {
        this.f2319b = true;
    }

    @Override // Fh.g
    public final void clear() {
        this.f2318a = null;
    }

    @Override // Fh.g
    public final boolean isEmpty() {
        Iterator it = this.f2318a;
        if (it == null) {
            return true;
        }
        if (!this.c || it.hasNext()) {
            return false;
        }
        this.f2318a = null;
        return true;
    }

    @Override // Fh.g
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // Fh.g
    public final Object poll() {
        Iterator it = this.f2318a;
        if (it == null) {
            return null;
        }
        if (!this.c) {
            this.c = true;
        } else if (!it.hasNext()) {
            return null;
        }
        Object next = this.f2318a.next();
        Objects.requireNonNull(next, "Iterator.next() returned a null value");
        return next;
    }

    @Override // nk.c
    public final void request(long j) {
        if (Ph.d.c(j) && v0.c(this, j) == 0) {
            if (j == Long.MAX_VALUE) {
                switch (this.f2320d) {
                    case 0:
                        Iterator it = this.f2318a;
                        Fh.a aVar = (Fh.a) this.e;
                        while (!this.f2319b) {
                            try {
                                Object next = it.next();
                                if (this.f2319b) {
                                    break;
                                } else if (next == null) {
                                    aVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    break;
                                } else {
                                    aVar.d(next);
                                    if (this.f2319b) {
                                        break;
                                    } else {
                                        try {
                                            if (!it.hasNext()) {
                                                if (!this.f2319b) {
                                                    aVar.onComplete();
                                                }
                                                break;
                                            }
                                        } catch (Throwable th2) {
                                            AbstractC0983W.G(th2);
                                            aVar.onError(th2);
                                            return;
                                        }
                                    }
                                }
                            } catch (Throwable th3) {
                                AbstractC0983W.G(th3);
                                aVar.onError(th3);
                            }
                        }
                        break;
                    default:
                        Iterator it2 = this.f2318a;
                        Ah.e eVar = this.e;
                        while (!this.f2319b) {
                            try {
                                Object next2 = it2.next();
                                if (this.f2319b) {
                                    break;
                                } else if (next2 == null) {
                                    eVar.onError(new NullPointerException("Iterator.next() returned a null value"));
                                    break;
                                } else {
                                    eVar.onNext(next2);
                                    if (this.f2319b) {
                                        break;
                                    } else {
                                        try {
                                            if (!it2.hasNext()) {
                                                if (!this.f2319b) {
                                                    eVar.onComplete();
                                                }
                                                break;
                                            }
                                        } catch (Throwable th4) {
                                            AbstractC0983W.G(th4);
                                            eVar.onError(th4);
                                            return;
                                        }
                                    }
                                }
                            } catch (Throwable th5) {
                                AbstractC0983W.G(th5);
                                eVar.onError(th5);
                                return;
                            }
                        }
                        break;
                }
            }
            switch (this.f2320d) {
                case 0:
                    Iterator it3 = this.f2318a;
                    Fh.a aVar2 = (Fh.a) this.e;
                    do {
                        long j6 = 0;
                        while (true) {
                            if (j6 == j) {
                                j = get();
                                if (j6 == j) {
                                    j = addAndGet(-j6);
                                }
                            } else if (this.f2319b) {
                                break;
                            } else {
                                try {
                                    Object next3 = it3.next();
                                    if (this.f2319b) {
                                        break;
                                    } else if (next3 == null) {
                                        aVar2.onError(new NullPointerException("Iterator.next() returned a null value"));
                                        break;
                                    } else {
                                        boolean zD = aVar2.d(next3);
                                        if (this.f2319b) {
                                            break;
                                        } else {
                                            try {
                                                if (!it3.hasNext()) {
                                                    if (!this.f2319b) {
                                                        aVar2.onComplete();
                                                    }
                                                    break;
                                                } else if (zD) {
                                                    j6++;
                                                }
                                            } catch (Throwable th6) {
                                                AbstractC0983W.G(th6);
                                                aVar2.onError(th6);
                                                return;
                                            }
                                        }
                                    }
                                } catch (Throwable th7) {
                                    AbstractC0983W.G(th7);
                                    aVar2.onError(th7);
                                    return;
                                }
                            }
                        }
                    } while (j != 0);
                    break;
                default:
                    Iterator it4 = this.f2318a;
                    Ah.e eVar2 = this.e;
                    do {
                        long j7 = 0;
                        while (true) {
                            if (j7 != j) {
                                if (!this.f2319b) {
                                    try {
                                        Object next4 = it4.next();
                                        if (!this.f2319b) {
                                            if (next4 == null) {
                                                eVar2.onError(new NullPointerException("Iterator.next() returned a null value"));
                                            } else {
                                                eVar2.onNext(next4);
                                                if (!this.f2319b) {
                                                    try {
                                                        if (it4.hasNext()) {
                                                            j7++;
                                                        } else if (!this.f2319b) {
                                                            eVar2.onComplete();
                                                        }
                                                    } catch (Throwable th8) {
                                                        AbstractC0983W.G(th8);
                                                        eVar2.onError(th8);
                                                        return;
                                                    }
                                                }
                                            }
                                        }
                                    } catch (Throwable th9) {
                                        AbstractC0983W.G(th9);
                                        eVar2.onError(th9);
                                        return;
                                    }
                                }
                                break;
                            } else {
                                j = get();
                                if (j7 == j) {
                                    j = addAndGet(-j7);
                                }
                            }
                        }
                    } while (j != 0);
                    break;
            }
        }
    }
}
