package dde.protobuf.fragments;

import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import defpackage.AbstractC1414e;
import dg.C1367A;
import dg.C1368B;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class GPS extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    private final Boolean isMock;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", schemaIndex = 0, tag = 1)
    private final Double latitude;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", schemaIndex = 1, tag = 2)
    private final Double longitude;
    public static final C1368B Companion = new C1368B();
    public static final ProtoAdapter<GPS> ADAPTER = new C1367A(FieldEncoding.LENGTH_DELIMITED, z.a(GPS.class), "type.googleapis.com/dde.protobuf.fragments.GPS", Syntax.PROTO_3, null, "dde-protobuf/fragments/GPS.proto");

    public GPS() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ GPS copy$default(GPS gps, Double d10, Double d11, Boolean bool, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            d10 = gps.latitude;
        }
        if ((i & 2) != 0) {
            d11 = gps.longitude;
        }
        if ((i & 4) != 0) {
            bool = gps.isMock;
        }
        if ((i & 8) != 0) {
            byteString = gps.unknownFields();
        }
        return gps.copy(d10, d11, bool, byteString);
    }

    public final GPS copy(Double d10, Double d11, Boolean bool, ByteString unknownFields) {
        j.g(unknownFields, "unknownFields");
        return new GPS(d10, d11, bool, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GPS)) {
            return false;
        }
        GPS gps = (GPS) obj;
        return j.b(unknownFields(), gps.unknownFields()) && j.a(this.latitude, gps.latitude) && j.a(this.longitude, gps.longitude) && j.b(this.isMock, gps.isMock);
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Double d10 = this.latitude;
        int iHashCode2 = (iHashCode + (d10 != null ? d10.hashCode() : 0)) * 37;
        Double d11 = this.longitude;
        int iHashCode3 = (iHashCode2 + (d11 != null ? d11.hashCode() : 0)) * 37;
        Boolean bool = this.isMock;
        int iHashCode4 = iHashCode3 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    public final Boolean isMock() {
        return this.isMock;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m239newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.latitude != null) {
            arrayList.add("latitude=" + this.latitude);
        }
        if (this.longitude != null) {
            arrayList.add("longitude=" + this.longitude);
        }
        if (this.isMock != null) {
            AbstractC1414e.q(new StringBuilder("isMock="), this.isMock, arrayList);
        }
        return C1110A.F(arrayList, ", ", "GPS{", "}", null, 56);
    }

    public /* synthetic */ GPS(Double d10, Double d11, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : d10, (i & 2) != 0 ? null : d11, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m239newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GPS(Double d10, Double d11, Boolean bool, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.latitude = d10;
        this.longitude = d11;
        this.isMock = bool;
    }
}
