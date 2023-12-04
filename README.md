## Biathlon Competition
A Java application for managing and evaluating biathlon competition results.

## Overview
This application reads a CSV file containing biathlon athlete data, 
calculates their final standings based on skiing time and shooting range results, 
and displays the top three positions: Winner, Runner-up, and Third Place.

## Features
Parses CSV data to extract athlete information
Calculates final standings considering skiing time and shooting range results
Displays top three positions with details

## Installation
Clone the repository: git clone https://github.com/DorinC263/BiathlonCompetition.git

Navigate to the project directory

Build the project using your preferred Java build tool (mvn package, gradle build, etc.)

## Usage
To use this application, follow these steps:

Prepare a CSV file with athlete data in the specified format (AthleteNumber, AthleteName, CountryCode, SkiTimeResult, FirstShootingRange, SecondShooting, ThirdShooting).

Replace the contents of the sample_data.csv file with your data.

Run the application.

CSV Format

The CSV file should follow this format: AthleteNumber,AthleteName,CountryCode,SkiTimeResult(Format: Minutes:Seconds),FirstShootingRange,SecondShooting,ThirdShooting

Shooting ranges consist of 5 characters, where 'x' indicates a hit and 'o' indicates a miss.

Each 'o' adds 10 seconds to the final time.

## Testing
Unit tests are included in the src/test directory to ensure the correctness of calculations and data parsing.

To run the tests, execute the following command: mvn test (or relevant command for your build tool).

## Contributing
Contributions are welcome! Feel free to open an issue or create a pull request for any improvements or bug fixes.
