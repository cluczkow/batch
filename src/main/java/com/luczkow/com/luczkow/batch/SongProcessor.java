package com.luczkow.com.luczkow.batch;

import org.springframework.batch.item.ItemProcessor;

/**
 * Created by chris luczkow on 11/7/2016.
 */
public class SongProcessor implements ItemProcessor<Song, Song> {

    @Override
    public Song process(final Song song) throws Exception {

        final String artist = song.getArtist();
        final String title = song.getTitle();

        return song;
    }
}
