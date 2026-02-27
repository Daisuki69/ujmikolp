package com.google.gson;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Serializable f10035a;

    public r(Boolean bool) {
        Objects.requireNonNull(bool);
        this.f10035a = bool;
    }

    public static boolean m(r rVar) {
        Serializable serializable = rVar.f10035a;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.gson.o
    public final BigDecimal a() {
        Serializable serializable = this.f10035a;
        return serializable instanceof BigDecimal ? (BigDecimal) serializable : com.google.gson.internal.e.j(j());
    }

    @Override // com.google.gson.o
    public final boolean c() {
        Serializable serializable = this.f10035a;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(j());
    }

    @Override // com.google.gson.o
    public final double d() {
        return this.f10035a instanceof Number ? l().doubleValue() : Double.parseDouble(j());
    }

    @Override // com.google.gson.o
    public final int e() {
        return this.f10035a instanceof Number ? l().intValue() : Integer.parseInt(j());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        Serializable serializable = this.f10035a;
        Serializable serializable2 = rVar.f10035a;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (m(this) && m(rVar)) {
            return ((serializable instanceof BigInteger) || (serializable2 instanceof BigInteger)) ? k().equals(rVar.k()) : l().longValue() == rVar.l().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        if ((serializable instanceof BigDecimal) && (serializable2 instanceof BigDecimal)) {
            return a().compareTo(rVar.a()) == 0;
        }
        double d10 = d();
        double d11 = rVar.d();
        if (d10 != d11) {
            return Double.isNaN(d10) && Double.isNaN(d11);
        }
        return true;
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f10035a;
        if (serializable == null) {
            return 31;
        }
        if (m(this)) {
            jDoubleToLongBits = l().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(l().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    @Override // com.google.gson.o
    public final long i() {
        return this.f10035a instanceof Number ? l().longValue() : Long.parseLong(j());
    }

    @Override // com.google.gson.o
    public final String j() {
        Serializable serializable = this.f10035a;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return l().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        throw new AssertionError("Unexpected value type: " + serializable.getClass());
    }

    public final BigInteger k() {
        Serializable serializable = this.f10035a;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (m(this)) {
            return BigInteger.valueOf(l().longValue());
        }
        String strJ = j();
        com.google.gson.internal.e.d(strJ);
        return new BigInteger(strJ);
    }

    public final Number l() {
        Serializable serializable = this.f10035a;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new com.google.gson.internal.g((String) serializable);
        }
        throw new UnsupportedOperationException("Primitive is neither a number nor a string");
    }

    public r(Number number) {
        Objects.requireNonNull(number);
        this.f10035a = number;
    }

    public r(String str) {
        Objects.requireNonNull(str);
        this.f10035a = str;
    }
}
