package defpackage;

import cj.C1110A;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import java.util.ArrayList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.z;
import okio.ByteString;

/* JADX INFO: loaded from: classes5.dex */
public final class Sensor extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "currentValue", schemaIndex = 2, tag = 3)
    private final String current_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "enabledSensorName", schemaIndex = 0, tag = 1)
    private final String enabled_sensor_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "minDelay", schemaIndex = 1, tag = 2)
    private final String min_delay;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final String vendor;
    public static final s0 Companion = new s0();
    public static final ProtoAdapter<Sensor> ADAPTER = new r0(FieldEncoding.LENGTH_DELIMITED, z.a(Sensor.class), "type.googleapis.com/Sensor", Syntax.PROTO_3, null, "dde-protobuf/models/core.proto");

    public Sensor() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ Sensor copy$default(Sensor sensor, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = sensor.enabled_sensor_name;
        }
        if ((i & 2) != 0) {
            str2 = sensor.min_delay;
        }
        if ((i & 4) != 0) {
            str3 = sensor.current_value;
        }
        if ((i & 8) != 0) {
            str4 = sensor.vendor;
        }
        if ((i & 16) != 0) {
            byteString = sensor.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str5 = str3;
        return sensor.copy(str, str2, str5, str4, byteString2);
    }

    public final Sensor copy(String str, String str2, String str3, String str4, ByteString unknownFields) {
        j.g(unknownFields, "unknownFields");
        return new Sensor(str, str2, str3, str4, unknownFields);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Sensor)) {
            return false;
        }
        Sensor sensor = (Sensor) obj;
        return j.b(unknownFields(), sensor.unknownFields()) && j.b(this.enabled_sensor_name, sensor.enabled_sensor_name) && j.b(this.min_delay, sensor.min_delay) && j.b(this.current_value, sensor.current_value) && j.b(this.vendor, sensor.vendor);
    }

    public final String getCurrent_value() {
        return this.current_value;
    }

    public final String getEnabled_sensor_name() {
        return this.enabled_sensor_name;
    }

    public final String getMin_delay() {
        return this.min_delay;
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
        String str = this.enabled_sensor_name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.min_delay;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.current_value;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 37;
        String str4 = this.vendor;
        int iHashCode5 = iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m30newBuilder();
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.enabled_sensor_name != null) {
            AbstractC1414e.p(this.enabled_sensor_name, new StringBuilder("enabled_sensor_name="), arrayList);
        }
        if (this.min_delay != null) {
            AbstractC1414e.p(this.min_delay, new StringBuilder("min_delay="), arrayList);
        }
        if (this.current_value != null) {
            AbstractC1414e.p(this.current_value, new StringBuilder("current_value="), arrayList);
        }
        if (this.vendor != null) {
            AbstractC1414e.p(this.vendor, new StringBuilder("vendor="), arrayList);
        }
        return C1110A.F(arrayList, ", ", "Sensor{", "}", null, 56);
    }

    public /* synthetic */ Sensor(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX INFO: renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m30newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Sensor(String str, String str2, String str3, String str4, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        j.g(unknownFields, "unknownFields");
        this.enabled_sensor_name = str;
        this.min_delay = str2;
        this.current_value = str3;
        this.vendor = str4;
    }
}
