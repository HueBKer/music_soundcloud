package attt.musicteam.ui.search;

import retrofit.RestAdapter;

/**
 * Created by Hue on 11/26/16.
 */
public class SoundCloud {
    private static final String API_URL = "http://api.soundcloud.com";
    private static final RestAdapter REST_ADAPTER = new RestAdapter.Builder()
            .setEndpoint(API_URL)
            .build();
    private static final SoundCloudService SERVICE = REST_ADAPTER.create(SoundCloudService.class);

    public static SoundCloudService getService(){
        return SERVICE;
    }
}
