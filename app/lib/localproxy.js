define(['jquery'], function($) {
    var LocalProxy = function() {
        var self = {};
        self.token = null;

        self.setCredentials = function(username, password, token_url) {
            self.username = username;
            self.password = password;
            self.token_url = token_url;
        };

        self.getPath = function(path, callback) {
            getToken(function(token) {
                callback(path.indexOf("?") >= 0 ? path + "&token=" + token : path + "?token=" + token);
            });
        };

        getToken = function(callback) {
            if(self.token) callback(self.token);
            $.ajax({
                //type: "POST",
                //url: self.token_url,
                type: "GET",
                url: "http://query.yahooapis.com/v1/public/yql?q=use%20%22http%3A%2F%2Fwww.plomino.net%2Fpost-yql%22%20as%20htmlpost%3B%0Aselect%20*%20from%20htmlpost%20where%0Aurl%3D'http%3A%2F%2Fsynchrone.meteo.fr%2Fpublic%2Fapi%2Fcustom%2Ftokens%2F'%0Aand%20postdata%3D%22%22%20and%20xpath%3D%22%2F%2Fp%22&format=json&diagnostics=true&env=store%3A%2F%2Fdatatables.org%2Falltableswithkeys&callback=",
                //data: {username: self.username, password: self.password},
                success: function(data) {
                    self.token = JSON.parse(data.query.results.postresult.p).token;
                    //self.token = data.token;
                    callback(self.token);
                },
                dataType: 'json'
            });
        };
        return self;
    };
    return LocalProxy();
});