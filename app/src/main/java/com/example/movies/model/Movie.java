package com.example.movies.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Movie {

    /**
     * results : [{"vote_count":617,"id":287947,"video":false,"vote_average":7.4,"title":"Shazam!","popularity":457.534,"poster_path":"/xnopI5Xtky18MPhK40cZAGAOVeV.jpg","original_language":"en","original_title":"Shazam!","genre_ids":[28,35,12,14],"backdrop_path":"/nmV9MdbzST4xv8WMHwhVgxkHHjM.jpg","adult":false,"overview":"A boy is given the ability to become an adult superhero in times of need with a single magic word.","release_date":"2019-03-23"},{"vote_count":3595,"id":299537,"video":false,"vote_average":7.2,"title":"Captain Marvel","popularity":313.735,"poster_path":"/AtsgWhDnHTq68L0lLsUrCnM7TjG.jpg","original_language":"en","original_title":"Captain Marvel","genre_ids":[28,12,878],"backdrop_path":"/w2PMyoyLU22YvrGK3smVM9fW1jj.jpg","adult":false,"overview":"The story follows Carol Danvers as she becomes one of the universe\u2019s most powerful heroes when Earth is caught in the middle of a galactic war between two alien races. Set in the 1990s, Captain Marvel is an all-new adventure from a previously unseen period in the history of the Marvel Cinematic Universe.","release_date":"2019-03-06"},{"vote_count":1369,"id":166428,"video":false,"vote_average":7.6,"title":"How to Train Your Dragon: The Hidden World","popularity":297.685,"poster_path":"/xvx4Yhf0DVH8G4LzNISpMfFBDy2.jpg","original_language":"en","original_title":"How to Train Your Dragon: The Hidden World","genre_ids":[16,10751,12],"backdrop_path":"/h3KN24PrOheHVYs9ypuOIdFBEpX.jpg","adult":false,"overview":"As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless\u2019 discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup\u2019s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind.","release_date":"2019-01-03"},{"vote_count":667,"id":522681,"video":false,"vote_average":6.3,"title":"Escape Room","popularity":226.596,"poster_path":"/8yZAx7tlKRZIg7pJfaPhl00yHIQ.jpg","original_language":"en","original_title":"Escape Room","genre_ids":[27,53,28,878,12,18,9648],"backdrop_path":"/mWLljCmpqlcYQh7uh51BBMwCZwN.jpg","adult":false,"overview":"Six strangers find themselves in circumstances beyond their control, and must use their wits to survive.","release_date":"2019-01-03"},{"vote_count":681,"id":329996,"video":false,"vote_average":6.7,"title":"Dumbo","popularity":151.199,"poster_path":"/279PwJAcelI4VuBtdzrZASqDPQr.jpg","original_language":"en","original_title":"Dumbo","genre_ids":[12,10751,14],"backdrop_path":"/5tFt6iuGnKapHl5tw0X0cKcnuVo.jpg","adult":false,"overview":"A young elephant, whose oversized ears enable him to fly, helps save a struggling circus, but when the circus plans a new venture, Dumbo and his friends discover dark secrets beneath its shiny veneer.","release_date":"2019-03-27"},{"vote_count":858,"id":458723,"video":false,"vote_average":7.3,"title":"Us","popularity":146.493,"poster_path":"/ux2dU1jQ2ACIMShzB3yP93Udpzc.jpg","original_language":"en","original_title":"Us","genre_ids":[53,27],"backdrop_path":"/ADJ6V8W96It4KElY2SPZvkKPBR.jpg","adult":false,"overview":"Husband and wife Gabe and Adelaide Wilson take their kids to their beach house expecting to unplug and unwind with friends. But as night descends, their serenity turns to tension and chaos when some shocking visitors arrive uninvited.","release_date":"2019-03-14"},{"vote_count":1819,"id":424783,"video":false,"vote_average":6.4,"title":"Bumblebee","popularity":132.219,"poster_path":"/fw02ONlDhrYjTSZV8XO6hhU3ds3.jpg","original_language":"en","original_title":"Bumblebee","genre_ids":[28,12,878],"backdrop_path":"/wtZj5nn6hVwgakPdg6y6gm3eFXU.jpg","adult":false,"overview":"On the run in the year 1987, Bumblebee finds refuge in a junkyard in a small Californian beach town. Charlie, on the cusp of turning 18 and trying to find her place in the world, discovers Bumblebee, battle-scarred and broken.  When Charlie revives him, she quickly learns this is no ordinary yellow VW bug.","release_date":"2018-12-15"},{"vote_count":276,"id":500682,"video":false,"vote_average":6.9,"title":"The Highwaymen","popularity":108.313,"poster_path":"/4bRYg4l12yDuJvAfqvUOPnBrxno.jpg","original_language":"en","original_title":"The Highwaymen","genre_ids":[80,18,53],"backdrop_path":"/pZ78ksjPlXf3q2EeONN8WdHE03Y.jpg","adult":false,"overview":"In 1934, Frank Hamer and Manny Gault, two former Texas Rangers, are commissioned to put an end to the wave of vicious crimes perpetrated by Bonnie Parker and Clyde Barrow, a notorious duo of infamous robbers and cold-blooded killers who nevertheless are worshiped by the public.","release_date":"2019-03-15"},{"vote_count":125,"id":157433,"video":false,"vote_average":6,"title":"Pet Sematary","popularity":106.735,"poster_path":"/7SPhr7Qj39vbnfF9O2qHRYaKHAL.jpg","original_language":"en","original_title":"Pet Sematary","genre_ids":[27,53],"backdrop_path":"/n2aX63BmW7zIKgKJ58e6rKlSsdi.jpg","adult":false,"overview":"Louis Creed, his wife Rachel and their two children Gage and Ellie move to a rural home where they are welcomed and enlightened about the eerie 'Pet Sematary' located nearby. After the tragedy of their cat being killed by a truck, Louis resorts to burying it in the mysterious pet cemetery, which is definitely not as it seems, as it proves to the Creeds that sometimes dead is better.","release_date":"2019-04-04"},{"vote_count":85,"id":454294,"video":false,"vote_average":6,"title":"The Kid Who Would Be King","popularity":99.915,"poster_path":"/kBuvLX6zynQP0sjyqbXV4jNaZ4E.jpg","original_language":"en","original_title":"The Kid Who Would Be King","genre_ids":[28,12,14,10751],"backdrop_path":"/jmbgxBd86MshzQQvv5laKvOKoMm.jpg","adult":false,"overview":"Old-school magic meets the modern world when young Alex stumbles upon the mythical sword Excalibur. He soon unites his friends and enemies, and they become knights who join forces with the legendary wizard Merlin. Together, they must save mankind from the wicked enchantress Morgana and her army of supernatural warriors.","release_date":"2019-01-16"},{"vote_count":1171,"id":504172,"video":false,"vote_average":6.5,"title":"The Mule","popularity":83.855,"poster_path":"/oeZh7yEz3PMnZLgBPhrafFHRbVz.jpg","original_language":"en","original_title":"The Mule","genre_ids":[80,18,53],"backdrop_path":"/bTeRgkAavyw1eCtSkaww18wLYNP.jpg","adult":false,"overview":"Earl Stone, a man in his 80s who is broke, alone, and facing foreclosure of his business when he is offered a job that simply requires him to drive. Easy enough, but, unbeknownst to Earl, he\u2019s just signed on as a drug courier for a Mexican cartel. He does so well that his cargo increases exponentially, and Earl hit the radar of hard-charging DEA agent Colin Bates.","release_date":"2018-12-14"},{"vote_count":306,"id":527641,"video":false,"vote_average":8.1,"title":"Five Feet Apart","popularity":82.215,"poster_path":"/kreTuJBkUjVWePRfhHZuYfhNE1T.jpg","original_language":"en","original_title":"Five Feet Apart","genre_ids":[10749,18],"backdrop_path":"/d7wa3VpUpKDQ7GG9EMw8zSJCFoI.jpg","adult":false,"overview":"Seventeen-year-old Stella spends most of her time in the hospital as a cystic fibrosis patient. Her life is full of routines, boundaries and self-control -- all of which get put to the test when she meets Will, an impossibly charming teen who has the same illness.","release_date":"2019-03-15"},{"vote_count":72,"id":471507,"video":false,"vote_average":6.4,"title":"Destroyer","popularity":76.479,"poster_path":"/sHw9gTdo43nJL82py0oaROkXXNr.jpg","original_language":"en","original_title":"Destroyer","genre_ids":[53,80,18,28],"backdrop_path":"/rURV5xPzt9ZxEXAc4OQmxchGyZ8.jpg","adult":false,"overview":"Erin Bell is an LAPD detective who, as a young cop, was placed undercover with a gang in the California desert with tragic results. When the leader of that gang re-emerges many years later, she must work her way back through the remaining members and into her own history with them to finally reckon with the demons that destroyed her past.","release_date":"2018-12-25"},{"vote_count":15,"id":576071,"video":false,"vote_average":6.4,"title":"Unplanned","popularity":76.439,"poster_path":"/hQvf3RHgmp4XXXl2y6zhMe4G4kg.jpg","original_language":"en","original_title":"Unplanned","genre_ids":[18],"backdrop_path":"/tgjwS3oh53biNsNuzRKUjUVdXAE.jpg","adult":false,"overview":"As one of the youngest Planned Parenthood clinic directors in the nation, Abby Johnson was involved in upwards of 22,000 abortions and counseled countless women on their reproductive choices. Her passion surrounding a woman's right to choose led her to become a spokesperson for Planned Parenthood, fighting to enact legislation for the cause she so deeply believed in. Until the day she saw something that changed everything.","release_date":"2019-03-21"},{"vote_count":1814,"id":399579,"video":false,"vote_average":6.6,"title":"Alita: Battle Angel","popularity":76.06,"poster_path":"/xRWht48C2V8XNfzvPehyClOvDni.jpg","original_language":"en","original_title":"Alita: Battle Angel","genre_ids":[28,878,53,12],"backdrop_path":"/aQXTw3wIWuFMy0beXRiZ1xVKtcf.jpg","adult":false,"overview":"When Alita awakens with no memory of who she is in a future world she does not recognize, she is taken in by Ido, a compassionate doctor who realizes that somewhere in this abandoned cyborg shell is the heart and soul of a young woman with an extraordinary past.","release_date":"2019-01-31"},{"vote_count":534,"id":512196,"video":false,"vote_average":6.1,"title":"Happy Death Day 2U","popularity":75.027,"poster_path":"/4tdnePOkOOzwuGPEOAHp8UA4vqx.jpg","original_language":"en","original_title":"Happy Death Day 2U","genre_ids":[27,9648,53,878,35],"backdrop_path":"/dhNJHBDacrZjSPtwaiwp3idpzxU.jpg","adult":false,"overview":"Collegian Tree Gelbman wakes up in horror to learn that she's stuck in a parallel universe. Her boyfriend Carter is now with someone else, and her friends and fellow students seem to be completely different versions of themselves. When Tree discovers that Carter's roommate has been altering time, she finds herself once again the target of a masked killer. When the psychopath starts to go after her inner circle, Tree soon realizes that she must die over and over again to save everyone.","release_date":"2019-02-13"},{"vote_count":116,"id":450001,"video":false,"vote_average":5.2,"title":"Master Z: Ip Man Legacy","popularity":71.868,"poster_path":"/nkCoAik5I4j3Gkd2upj9xv4F0QN.jpg","original_language":"cn","original_title":"葉問外傳：張天志","genre_ids":[28],"backdrop_path":"/grtVFGJ4ts0nDAPpc1JWbBoVKTu.jpg","adult":false,"overview":"After being defeated by Ip Man, Cheung Tin Chi is attempting to keep a low profile. While going about his business, he gets into a fight with a foreigner by the name of Davidson, who is a big boss behind the bar district. Tin Chi fights hard with Wing Chun and earns respect.","release_date":"2018-12-20"},{"vote_count":39,"id":411728,"video":false,"vote_average":8,"title":"The Professor and the Madman","popularity":69.074,"poster_path":"/yBaf5WjUqTQbc6mzPQBUcBiauDI.jpg","original_language":"en","original_title":"The Professor and the Madman","genre_ids":[18,36],"backdrop_path":"/5Zjh2jPZyN0tuXmKXKuLEWy0k2S.jpg","adult":false,"overview":"Professor James Murray begins work compiling words for the first edition of the Oxford English Dictionary in the mid 19th century and receives over 10,000 entries from a patient at Broadmoor Criminal Lunatic Asylum , Dr William Minor.","release_date":"2019-03-07"},{"vote_count":35,"id":500904,"video":false,"vote_average":4.8,"title":"A Vigilante","popularity":66.773,"poster_path":"/avoKZfgBzyBGJsrAr2WQOwZK978.jpg","original_language":"en","original_title":"A Vigilante","genre_ids":[53,18],"backdrop_path":"/kReEky4XRCAq22H5V37kDcNY9dj.jpg","adult":false,"overview":"A vigilante helps victims escape their domestic abusers.","release_date":"2019-03-29"},{"vote_count":255,"id":464504,"video":false,"vote_average":5.5,"title":"A Madea Family Funeral","popularity":64.58,"poster_path":"/sFvOTUlZrIxCLdmz1fC16wK0lme.jpg","original_language":"en","original_title":"A Madea Family Funeral","genre_ids":[35],"backdrop_path":"/piGjUloiaq6qTpaDLisyDyEsx9i.jpg","adult":false,"overview":"A joyous family reunion becomes a hilarious nightmare as Madea and the crew travel to backwoods Georgia, where they find themselves unexpectedly planning a funeral that might unveil unpleasant family secrets.","release_date":"2019-03-01"}]
     * page : 1
     * total_results : 1136
     * dates : {"maximum":"2019-04-08","minimum":"2019-02-19"}
     * total_pages : 57
     */

    @SerializedName("page")
    private int page;
    @SerializedName("total_results")
    private int totalResults;
    @SerializedName("dates")
    private DatesBean dates;
    @SerializedName("total_pages")
    private int totalPages;
    @SerializedName("results")
    private List<ResultsBean> results;

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public DatesBean getDates() {
        return dates;
    }

    public void setDates(DatesBean dates) {
        this.dates = dates;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class DatesBean {
        /**
         * maximum : 2019-04-08
         * minimum : 2019-02-19
         */

        @SerializedName("maximum")
        private String maximum;
        @SerializedName("minimum")
        private String minimum;

        public String getMaximum() {
            return maximum;
        }

        public void setMaximum(String maximum) {
            this.maximum = maximum;
        }

        public String getMinimum() {
            return minimum;
        }

        public void setMinimum(String minimum) {
            this.minimum = minimum;
        }
    }

    public static class ResultsBean implements Parcelable {
        /**
         * vote_count : 617
         * id : 287947
         * video : false
         * vote_average : 7.4
         * title : Shazam!
         * popularity : 457.534
         * poster_path : /xnopI5Xtky18MPhK40cZAGAOVeV.jpg
         * original_language : en
         * original_title : Shazam!
         * genre_ids : [28,35,12,14]
         * backdrop_path : /nmV9MdbzST4xv8WMHwhVgxkHHjM.jpg
         * adult : false
         * overview : A boy is given the ability to become an adult superhero in times of need with a single magic word.
         * release_date : 2019-03-23
         */

        @SerializedName("vote_count")
        private int voteCount;
        @SerializedName("id")
        private int id;
        @SerializedName("video")
        private boolean video;
        @SerializedName("vote_average")
        private double voteAverage;
        @SerializedName("title")
        private String title;
        @SerializedName("popularity")
        private double popularity;
        @SerializedName("poster_path")
        private String posterPath;
        @SerializedName("original_language")
        private String originalLanguage;
        @SerializedName("original_title")
        private String originalTitle;
        @SerializedName("backdrop_path")
        private String backdropPath;
        @SerializedName("adult")
        private boolean adult;
        @SerializedName("overview")
        private String overview;
        @SerializedName("release_date")
        private String releaseDate;
        @SerializedName("genre_ids")
        private List<Integer> genreIds;

        protected ResultsBean(Parcel in) {
            voteCount = in.readInt();
            id = in.readInt();
            video = in.readByte() != 0;
            voteAverage = in.readDouble();
            title = in.readString();
            popularity = in.readDouble();
            posterPath = in.readString();
            originalLanguage = in.readString();
            originalTitle = in.readString();
            backdropPath = in.readString();
            adult = in.readByte() != 0;
            overview = in.readString();
            releaseDate = in.readString();
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(voteCount);
            dest.writeInt(id);
            dest.writeByte((byte) (video ? 1 : 0));
            dest.writeDouble(voteAverage);
            dest.writeString(title);
            dest.writeDouble(popularity);
            dest.writeString(posterPath);
            dest.writeString(originalLanguage);
            dest.writeString(originalTitle);
            dest.writeString(backdropPath);
            dest.writeByte((byte) (adult ? 1 : 0));
            dest.writeString(overview);
            dest.writeString(releaseDate);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public static final Creator<ResultsBean> CREATOR = new Creator<ResultsBean>() {
            @Override
            public ResultsBean createFromParcel(Parcel in) {
                return new ResultsBean(in);
            }

            @Override
            public ResultsBean[] newArray(int size) {
                return new ResultsBean[size];
            }
        };

        public int getVoteCount() {
            return voteCount;
        }

        public void setVoteCount(int voteCount) {
            this.voteCount = voteCount;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public boolean isVideo() {
            return video;
        }

        public void setVideo(boolean video) {
            this.video = video;
        }

        public double getVoteAverage() {
            return voteAverage;
        }

        public void setVoteAverage(double voteAverage) {
            this.voteAverage = voteAverage;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public double getPopularity() {
            return popularity;
        }

        public void setPopularity(double popularity) {
            this.popularity = popularity;
        }

        public String getPosterPath() {
            return posterPath;
        }

        public void setPosterPath(String posterPath) {
            this.posterPath = posterPath;
        }

        public String getOriginalLanguage() {
            return originalLanguage;
        }

        public void setOriginalLanguage(String originalLanguage) {
            this.originalLanguage = originalLanguage;
        }

        public String getOriginalTitle() {
            return originalTitle;
        }

        public void setOriginalTitle(String originalTitle) {
            this.originalTitle = originalTitle;
        }

        public String getBackdropPath() {
            return backdropPath;
        }

        public void setBackdropPath(String backdropPath) {
            this.backdropPath = backdropPath;
        }

        public boolean isAdult() {
            return adult;
        }

        public void setAdult(boolean adult) {
            this.adult = adult;
        }

        public String getOverview() {
            return overview;
        }

        public void setOverview(String overview) {
            this.overview = overview;
        }

        public String getReleaseDate() {
            return releaseDate;
        }

        public void setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
        }

        public List<Integer> getGenreIds() {
            return genreIds;
        }

        public void setGenreIds(List<Integer> genreIds) {
            this.genreIds = genreIds;
        }
    }
}
