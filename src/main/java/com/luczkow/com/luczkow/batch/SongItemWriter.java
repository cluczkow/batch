package com.luczkow.com.luczkow.batch;

import org.springframework.batch.item.ItemWriter;

import java.util.List;

/**
 * Created by chris luczkow on 11/7/2016.
 */
public class SongItemWriter implements ItemWriter<Song> {

    public void write(List<? extends Song> songs) throws Exception {

        for (final Song song : songs) {
            System.out.println(song.getArtist() + " - " + song.getTitle());
        }
    }
}
