package top;

import java.util.regex.Pattern;

public class TestChatGpt {

    public static class SongNameMatcher {
        private static final String PATTERN_STRING = "^(.*)(\\((Live|现场|Concert|World Tour|演唱会|En Vivo|Ao Vivo)\\)|Remix|Mix|Remixes|Yearmix|Remake|Remastered|DJ|咚鼓版|弹鼓版|越南鼓|越鼓版|\\p{InCJKUnifiedIdeographs}*\\p{InHangulSyllables}*\\p{InHiragana}*\\p{InKatakana}*|Demo)*$";
        private static final Pattern PATTERN = Pattern.compile(PATTERN_STRING);

        public static boolean isMatched(String songName1, String songName2) {
            String normalizedSongName1 = normalizeSongName(songName1);
            String normalizedSongName2 = normalizeSongName(songName2);
            return normalizedSongName1.equals(normalizedSongName2);
        }

        private static String normalizeSongName(String songName) {
            return songName.replaceAll(PATTERN_STRING, "$1").trim();
        }
    }

    public static void main(String[] args) {

        String name1 = "花海";
        String name2 = "花海Live";
        assert SongNameMatcher.isMatched(name1, name2);

        name2="七里香";
        assert !SongNameMatcher.isMatched(name1, name2);
    }
}
