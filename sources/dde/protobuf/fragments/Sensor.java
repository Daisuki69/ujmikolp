package dde.protobuf.fragments;

import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import defpackage.AbstractC1414e;
import dg.X;
import dg.Y;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class Sensor extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", schemaIndex = 2, tag = 3)
    private final Integer minDelay;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
    private final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final String vendor;
    public static final Y Companion = new Y();
    public static final ProtoAdapter<Sensor> ADAPTER = new X(FieldEncoding.LENGTH_DELIMITED, z.a(Sensor.class), "type.googleapis.com/dde.protobuf.fragments.Sensor", Syntax.PROTO_3, null, "dde-protobuf/fragments/Sensor.proto");

    public Sensor() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ Sensor copy$default(Sensor sensor, String str, String str2, Integer num, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sensor.name;
        }
        if ((i & 2) != 0) {
            str2 = sensor.vendor;
        }
        if ((i & 4) != 0) {
            num = sensor.minDelay;
        }
        if ((i & 8) != 0) {
            byteString = sensor.unknownFields();
        }
        return sensor.copy(str, str2, num, byteString);
    }

    public final Sensor copy(String str, String str2, Integer num, ByteString unknownFields) {
        j.g(unknownFields, "unknownFields");
        return new Sensor(str, str2, num, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Sensor)) {
            return false;
        }
        Sensor sensor = (Sensor) obj;
        return j.b(unknownFields(), sensor.unknownFields()) && j.b(this.name, sensor.name) && j.b(this.vendor, sensor.vendor) && j.b(this.minDelay, sensor.minDelay);
    }

    public final Integer getMinDelay() {
        return this.minDelay;
    }

    public final String getName() {
        return this.name;
    }

    public final String getVendor() {
        return this.vendor;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.vendor;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        Integer num = this.minDelay;
        int iHashCode4 = iHashCode3 + (num != null ? num.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m250newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.name != null) {
            AbstractC1414e.p(this.name, new StringBuilder("name="), arrayList);
        }
        if (this.vendor != null) {
            AbstractC1414e.p(this.vendor, new StringBuilder("vendor="), arrayList);
        }
        if (this.minDelay != null) {
            AbstractC1414e.r(new StringBuilder("minDelay="), this.minDelay, arrayList);
        }
        return C1110A.F(arrayList, ", ", "Sensor{", "}", null, 56);
    }

    public /* synthetic */ Sensor(String str, String str2, Integer num, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m250newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sensor(String str, String str2, Integer num, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.name = str;
        this.vendor = str2;
        this.minDelay = num;
    }
}
