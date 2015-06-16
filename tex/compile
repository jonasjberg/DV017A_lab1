#!/bin/bash
# pdflatex Wrapper
# ----------------
# Script for converting LaTeX source files to pdf using pdflatex 
# Written in 2014 by Jonas Sjöberg for PRIVATE USE.
# Updated 2015-06-16.

INPUT="${1}"
OUTPUT="build"


mkdir -pv ${OUTPUT}

echo "running pdflatex .."

pdflatex -synctex=1 -interaction=nonstopmode -shell-escape \
--output-directory="${OUTPUT}" "${INPUT}"

echo "done running pdflatex!"
