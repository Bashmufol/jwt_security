package com.bash.springsecuritydemo.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;

@Service
public class JwtService {
    private static final String secretKey = "FlBeNjqCjBgz1itEGaNjQFfQ44pm0A3zoOxcviqWoSrMZBAYsisvLOyjz6vL8BXG\n";
    public String extractUsername(String token) {
        return null;
    }

    private Claims extractAllClaims(String token) {
        // 1. Build the parser
        return Jwts
                .parser()
                .setSigningKey(getSigningKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    private Key getSigningKey() {
        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
    }
}
