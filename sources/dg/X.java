package dg;

import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import dOYHB6.tiZVw8.numX49;
import dde.protobuf.fragments.Sensor;
import java.io.IOException;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
public final class X extends ProtoAdapter {
    @Override // com.squareup.wire.ProtoAdapter
    public final Object decode(ProtoReader protoReader) throws IOException {
        kotlin.jvm.internal.j.g(protoReader, numX49.tnTj78("bd5Pm"));
        long jBeginMessage = protoReader.beginMessage();
        String strDecode = null;
        String strDecode2 = null;
        Integer numDecode = null;
        while (true) {
            int iNextTag = protoReader.nextTag();
            if (iNextTag == -1) {
                return new Sensor(strDecode, strDecode2, numDecode, protoReader.endMessageAndGetUnknownFields(jBeginMessage));
            }
            if (iNextTag == 1) {
                strDecode = ProtoAdapter.STRING.decode(protoReader);
            } else if (iNextTag == 2) {
                strDecode2 = ProtoAdapter.STRING.decode(protoReader);
            } else if (iNextTag != 3) {
                protoReader.readUnknownField(iNextTag);
            } else {
                numDecode = ProtoAdapter.INT32.decode(protoReader);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ProtoWriter protoWriter, Object obj) throws IOException {
        Sensor sensor = (Sensor) obj;
        kotlin.jvm.internal.j.g(protoWriter, numX49.tnTj78("bd5PD"));
        kotlin.jvm.internal.j.g(sensor, numX49.tnTj78("bd5Ph"));
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(protoWriter, 1, sensor.getName());
        protoAdapter.encodeWithTag(protoWriter, 2, sensor.getVendor());
        ProtoAdapter.INT32.encodeWithTag(protoWriter, 3, sensor.getMinDelay());
        protoWriter.writeBytes(sensor.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final int encodedSize(Object obj) {
        Sensor sensor = (Sensor) obj;
        kotlin.jvm.internal.j.g(sensor, numX49.tnTj78("bd5P6"));
        int size = sensor.unknownFields().size();
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return ProtoAdapter.INT32.encodedSizeWithTag(3, sensor.getMinDelay()) + protoAdapter.encodedSizeWithTag(2, sensor.getVendor()) + protoAdapter.encodedSizeWithTag(1, sensor.getName()) + size;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final Object redact(Object obj) {
        Sensor sensor = (Sensor) obj;
        kotlin.jvm.internal.j.g(sensor, numX49.tnTj78("bd5Pa"));
        return Sensor.copy$default(sensor, null, null, null, ByteString.EMPTY, 7, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public final void encode(ReverseProtoWriter reverseProtoWriter, Object obj) throws IOException {
        Sensor sensor = (Sensor) obj;
        kotlin.jvm.internal.j.g(reverseProtoWriter, numX49.tnTj78("bd5PM"));
        kotlin.jvm.internal.j.g(sensor, numX49.tnTj78("bd5PN"));
        reverseProtoWriter.writeBytes(sensor.unknownFields());
        ProtoAdapter.INT32.encodeWithTag(reverseProtoWriter, 3, sensor.getMinDelay());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(reverseProtoWriter, 2, sensor.getVendor());
        protoAdapter.encodeWithTag(reverseProtoWriter, 1, sensor.getName());
    }
}
