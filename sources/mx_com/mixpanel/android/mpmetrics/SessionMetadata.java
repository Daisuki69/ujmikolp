package mx_com.mixpanel.android.mpmetrics;

import java.security.SecureRandom;
import mx_com.mixpanel.android.util.MPLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
class SessionMetadata {
    private long mEventsCounter;
    private long mPeopleCounter;
    private final SecureRandom mRandom;
    private String mSessionID;
    private long mSessionStartEpoch;

    SessionMetadata() {
        initSession();
        this.mRandom = new SecureRandom();
    }

    protected void initSession() {
        this.mEventsCounter = 0L;
        this.mPeopleCounter = 0L;
        this.mSessionID = Long.toHexString(new SecureRandom().nextLong());
        this.mSessionStartEpoch = System.currentTimeMillis() / 1000;
    }

    public JSONObject getMetadataForEvent() {
        return getNewMetadata(true);
    }

    public JSONObject getMetadataForPeople() {
        return getNewMetadata(false);
    }

    private JSONObject getNewMetadata(boolean z4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("$mp_event_id", Long.toHexString(this.mRandom.nextLong()));
            jSONObject.put("$mp_session_id", this.mSessionID);
            jSONObject.put("$mp_session_seq_id", z4 ? this.mEventsCounter : this.mPeopleCounter);
            jSONObject.put("$mp_session_start_sec", this.mSessionStartEpoch);
            if (z4) {
                this.mEventsCounter++;
            } else {
                this.mPeopleCounter++;
            }
        } catch (JSONException e) {
            MPLog.e(ConfigurationChecker.LOGTAG, "Cannot create session metadata JSON object", e);
        }
        return jSONObject;
    }
}
