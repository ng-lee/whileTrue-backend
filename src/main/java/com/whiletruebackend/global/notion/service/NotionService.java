package com.whiletruebackend.global.notion.service;

import com.whiletruebackend.domain.Problem.vo.Problem;
import com.whiletruebackend.global.notion.dto.response.RetrieveDatabaseResponseDto;
import com.whiletruebackend.global.notion.vo.NotionAccessToken;

import java.util.List;

public interface NotionService {

    NotionAccessToken requestNotionToken(String accessCode);

    RetrieveDatabaseResponseDto retrieveDatabase(String notionApiKey, String databaseId);

    List<Problem> getAllProblemList(String notionApiKey, String databaseId);

    boolean isProblemExists(String notionApiKey, String databaseId, Problem problem);

    void insertNewProblem(String notionApiKey, String databaseId, Problem problem);
}
